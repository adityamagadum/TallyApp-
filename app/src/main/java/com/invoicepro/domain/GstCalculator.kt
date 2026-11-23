package com.invoicepro.domain

import java.math.BigDecimal
import java.math.RoundingMode

data class DraftLine(val description:String,val hsn:String,val quantity:BigDecimal,val rate:BigDecimal,val gst:BigDecimal,val unit:String="Nos")
data class TaxLine(val line:DraftLine,val taxable:BigDecimal,val tax:BigDecimal,val total:BigDecimal)
data class TaxSummary(val lines:List<TaxLine>,val subtotal:BigDecimal,val igst:BigDecimal,val cgst:BigDecimal,val sgst:BigDecimal,val roundOff:BigDecimal,val grandTotal:BigDecimal)
object GstCalculator { private val H=RoundingMode.HALF_UP; fun calculate(lines:List<DraftLine>, interState:Boolean):TaxSummary { val computed=lines.map { line -> val taxable=line.quantity.multiply(line.rate).setScale(2,H); val tax=taxable.multiply(line.gst).divide(BigDecimal(100),2,H); TaxLine(line,taxable,tax,taxable+tax) }; val sub=computed.fold(BigDecimal.ZERO){a,b->a+b.taxable}.setScale(2,H); val tax=computed.fold(BigDecimal.ZERO){a,b->a+b.tax}.setScale(2,H); val gross=sub+tax; val rounded=gross.setScale(0,H); val adjustment=rounded-gross; return TaxSummary(computed,sub,if(interState)tax else BigDecimal.ZERO,if(interState)BigDecimal.ZERO else tax.divide(BigDecimal(2),2,H),if(interState)BigDecimal.ZERO else tax.subtract(tax.divide(BigDecimal(2),2,H)),adjustment,rounded) } }
