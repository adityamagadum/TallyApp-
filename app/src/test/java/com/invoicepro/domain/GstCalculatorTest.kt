package com.invoicepro.domain

import org.junit.Assert.assertEquals
import org.junit.Test
import java.math.BigDecimal

class GstCalculatorTest {
 @Test fun `intra state splits GST and rounds grand total`() {
  val result=GstCalculator.calculate(listOf(DraftLine("Part","8708",BigDecimal("2"),BigDecimal("52.50"),BigDecimal("18"))),false)
  assertEquals("105.00",result.subtotal.toPlainString());assertEquals("9.45",result.cgst.toPlainString());assertEquals("9.45",result.sgst.toPlainString());assertEquals("124",result.grandTotal.toPlainString())
 }
 @Test fun `inter state GST supports decimal rate`() {
  val result=GstCalculator.calculate(listOf(DraftLine("Part","9988",BigDecimal("1.5"),BigDecimal("99.99"),BigDecimal("5"))),true)
  assertEquals("149.99",result.subtotal.toPlainString());assertEquals("7.50",result.igst.toPlainString())
 }
 @Test fun `multiple GST rates aggregate consistently`() {
  val result=GstCalculator.calculate(listOf(DraftLine("A","1",BigDecimal.ONE,BigDecimal("100"),BigDecimal("5")),DraftLine("B","2",BigDecimal.ONE,BigDecimal("100"),BigDecimal("18"))),true)
  assertEquals("200.00",result.subtotal.toPlainString());assertEquals("23.00",result.igst.toPlainString());assertEquals("223",result.grandTotal.toPlainString())
 }
}
