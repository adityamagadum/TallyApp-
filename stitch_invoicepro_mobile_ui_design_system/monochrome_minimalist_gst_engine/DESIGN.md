---
name: Monochrome Minimalist GST Engine
colors:
  surface: '#f9f9f9'
  surface-dim: '#dadada'
  surface-bright: '#f9f9f9'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f3f3f4'
  surface-container: '#eeeeee'
  surface-container-high: '#e8e8e8'
  surface-container-highest: '#e2e2e2'
  on-surface: '#1a1c1c'
  on-surface-variant: '#444748'
  inverse-surface: '#2f3131'
  inverse-on-surface: '#f0f1f1'
  outline: '#747878'
  outline-variant: '#c4c7c7'
  surface-tint: '#5f5e5e'
  primary: '#000000'
  on-primary: '#ffffff'
  primary-container: '#1c1b1b'
  on-primary-container: '#858383'
  inverse-primary: '#c8c6c5'
  secondary: '#5d5e66'
  on-secondary: '#ffffff'
  secondary-container: '#e3e1ec'
  on-secondary-container: '#63646c'
  tertiary: '#000000'
  on-tertiary: '#ffffff'
  tertiary-container: '#191c1f'
  on-tertiary-container: '#818488'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#e5e2e1'
  primary-fixed-dim: '#c8c6c5'
  on-primary-fixed: '#1c1b1b'
  on-primary-fixed-variant: '#474646'
  secondary-fixed: '#e3e1ec'
  secondary-fixed-dim: '#c6c5cf'
  on-secondary-fixed: '#1a1b22'
  on-secondary-fixed-variant: '#46464e'
  tertiary-fixed: '#e0e2e6'
  tertiary-fixed-dim: '#c4c7ca'
  on-tertiary-fixed: '#191c1f'
  on-tertiary-fixed-variant: '#44474a'
  background: '#f9f9f9'
  on-background: '#1a1c1c'
  surface-variant: '#e2e2e2'
typography:
  headline-lg:
    fontFamily: Inter
    fontSize: 24px
    fontWeight: '700'
    lineHeight: 32px
    letterSpacing: -0.02em
  headline-md:
    fontFamily: Inter
    fontSize: 20px
    fontWeight: '600'
    lineHeight: 28px
    letterSpacing: -0.015em
  headline-sm:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '600'
    lineHeight: 24px
    letterSpacing: -0.01em
  body-lg:
    fontFamily: Inter
    fontSize: 15px
    fontWeight: '500'
    lineHeight: 22px
    letterSpacing: 0em
  body-md:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '400'
    lineHeight: 20px
    letterSpacing: 0em
  body-sm:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '400'
    lineHeight: 16px
    letterSpacing: 0.01em
  label-lg:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '600'
    lineHeight: 20px
    letterSpacing: 0.01em
  label-md:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '500'
    lineHeight: 16px
    letterSpacing: 0.02em
  label-sm:
    fontFamily: Inter
    fontSize: 10px
    fontWeight: '600'
    lineHeight: 14px
    letterSpacing: 0.03em
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  gutter: 0.75rem
  margin: 1rem
  space-xs: 0.25rem
  space-sm: 0.5rem
  space-md: 0.75rem
  space-lg: 1rem
  space-xl: 1.5rem
---

## Brand & Style

The brand personality is disciplined, utilitarian, highly structured, and uncompromisingly efficient. Built for micro, small, and medium enterprise operators navigating GST invoicing in field and shopfloor environments, the user interface demands immediate legibility, zero aesthetic distraction, and instant comprehension.

The design movement is **Monochrome Functional Minimalism** blended with strict **Swiss International Typographic Style**. It rejects decorative gradients, colored status indicators, and ambient decorative blurs in favor of strict stark black-and-white tonal contrast, crisp divider lines, structural framing, and clear typographic hierarchy. Visual weight is communicated strictly through surface tones (pure white to cool slate grays), border definitions, and stark solid black interactive anchors. The resulting experience feels akin to a physical accounting ledger translated into high-density Android software: fast, authoritative, and perpetually offline-resilient.

## Colors

The palette is strictly achromatic, relying on calibrated levels of gray to communicate depth, boundaries, and affordances:

- **Surface Neutral Canvas (`#FFFFFF`):** Base canvas applied to root screens, bottom sheets, and viewports.
- **Surface Layer 1 (`#F8F9FA`):** Used for elevated cards, inactive list row containers, summary statistics, and search bar backgrounds.
- **Surface Layer 2 (`#F1F3F5`):** Subdued surface container applied to input text fields, selected state highlights, and disabled component backdrops.
- **Primary Interactive & Accent (`#111111` / `#000000`):** Solid pitch-black used for primary action buttons (CTA), active state pill tags, active step indicators, and high-emphasis numerals.
- **Secondary / Supporting (`#71717A`):** Cool neutral gray reserved for secondary metadata, HSN/SAC codes, step-tracker trailing icons, and subtle helper captions.
- **Structural Line / Border (`#E5E7EB` to `#E2E8F0`):** 1px boundary rules separating content rows, list card borders, step connectors, and inactive input field strokes.
- **Semantic Neutrality:** Status badges and verification cues do not rely on loud reds or greens; instead, verification and confirmation states use inverted black badges (`#111111` text on `#F1F3F5` or solid `#111111` fills with `#FFFFFF` iconography).

## Typography

The type system is powered entirely by **Inter**, configured for immediate tabular scanning, legibility at micro sizes, and stark hierarchy on dense mobile viewports:

- **Financial and Numeric Data:** All currency figures, tax percentages, HSN codes, and calculation totals must render with OpenType tabular figures (`tnum`) enabled to ensure vertical alignment across invoice balance sheets.
- **Headings & Metric Displays:** `headline-lg` and `headline-md` establish clear regional anchors for dashboard totals and invoice amounts (e.g., `₹10,077.00`).
- **Form Inputs & Card Labels:** `body-md` handles default input field typing and primary row titles, while `label-md` and `label-sm` govern uppercase GST identifiers, step numbers, and helper labels.
- **Contrast & Hierarchy:** Primary values use `#111111` with bold or semi-bold weights. Supporting descriptions, HSN codes, and timestamps drop to `#71717A` with regular weights (`400`).

## Layout & Spacing

The layout follows an Android-first fluid vertical model tailored for high-frequency one-handed and split-pane interactions:

- **Canvas & Screen Margins:** Mobile viewport edges enforce a strict outer boundary of `1rem` (16px). Form components and nested list cards align flush to this boundary.
- **Vertical Flow & Form Stacking:** Vertical input stacks maintain `0.75rem` (12px) separation between sibling input containers, while structural invoice blocks (Seller, Buyer, Bill Summary) use `1rem` (16px) margins.
- **Sticky Viewport Footers:** Modal creation screens and bottom checkout flows reserve a fixed bottom action shelf (height `72px` + device system navigation inset), ensuring the primary step CTA remains permanently reachable.
- **Android System Accommodations:** Layouts must account for standard Android 3-button or gesture navigation insets at the bottom (`space-xl` buffer) and the edge-to-edge camera hole-punch status bar at the top (`2.5rem` minimum safe area padding).

## Elevation & Depth

Visual hierarchy rejects fuzzy drop shadows in favor of **structural line-delineated flatness and tonal surface shifts**:

- **Zero Drop Shadows:** Elevation levels 0 through 4 utilize zero pixel blur shadows (`box-shadow: none`), avoiding blurred artifacts on varied display panels.
- **Border-Defined Surfaces:** Hierarchy is established through continuous 1px strokes (`#E5E7EB`) wrapping slightly offset backgrounds (`#FFFFFF` resting upon `#F8F9FA`, or `#F8F9FA` card containers resting on `#FFFFFF` viewport canvases).
- **Floating Action Anchors (FAB):** The single exception to elevation is the floating action button (`+`), which leverages an intense, sharp offset shadow (`0px 4px 12px rgba(0, 0, 0, 0.18)`) over pitch black `#111111` to create distinct operational detachment from the scrolling list behind it.
- **Overlays and Bottom Drawers:** Modal sheets layer above the page with a clean 30% alpha neutral scrim (`rgba(0, 0, 0, 0.3)`), bound by a 1px solid border at `#E5E7EB` on top surfaces.

## Shapes

The geometric framework balances functional modernism with accessible tactile tap points:

- **Standard Containers & Cards:** Set to `roundedness: 2` (8px / 0.5rem base radius) across all invoice cards, bill summary cards, item rows, and text fields.
- **Filter Tags & Navigation Badges:** Pill-shaped radii (`9999px`) are strictly enforced for category tags (e.g., `All`, `Brackets`, `Clips`, `Others`), search filter chips, and company status labels.
- **Floating Action Button (FAB):** Circular (`border-radius: 50%`) with high-contrast icon centering.
- **Primary CTAs:** Large interaction targets (buttons like `Next →`, `Save Item`, `Generate Invoice`) use matching `0.5rem` to `0.75rem` corners to fit securely within the thumb zone.

## Components

### Buttons
- **Primary Full-Width Button:** Solid `#111111` background, `#FFFFFF` text, `font-weight: 600`, height `48px`, border-radius `8px`. Active state transitions to `#262626`.
- **Secondary / Outlined Button:** `#FFFFFF` background, 1px solid `#E5E7EB` border, `#111111` label, height `48px`.
- **Floating Action Button (FAB):** 56px circle, solid `#111111` background, white 24px icon, anchored bottom-right with 16px viewport offsets.

### Form Fields & Inputs
- **Text & Numeric Inputs:** Height `46px`, background `#FFFFFF` or `#F8F9FA`, 1px solid `#E5E7EB`, 8px radius. Text in `#111111`, placeholder in `#71717A`.
- **Focused State:** 1.5px solid `#111111` border with zero outline ring.
- **Required Indicator:** Small dark asterisk with subtle 0.25rem label spacing.
- **Prefix / Suffix Elements:** Right-aligned icons (calendar, chevrons, unit selector dropdown arrows) rendered in crisp 1.5px outline stroke `#71717A`.

### Multi-Step Wizard Header
- **Indicator Nodes:** Horizontal 3-step row (`Details`, `Items`, `Review`).
- **Completed / Active Step:** 24px filled `#111111` circle containing white checkmark or step number, accompanied by bold `#111111` text.
- **Inactive Step:** 24px outlined `#E5E7EB` circle containing `#71717A` numeral, with connecting 1px rule `#E5E7EB`.

### Category & Filter Chips
- **Active Filter:** Solid `#111111` fill, `#FFFFFF` text, pill radius (`9999px`), horizontal padding `14px`, height `32px`.
- **Inactive Filter:** `#FFFFFF` fill, 1px solid `#E5E7EB` border, `#71717A` text, matching dimensions.

### List Items & Summary Cards
- **Product & Invoice List Rows:** Wrapped within 1px solid `#E5E7EB` cards or clean dividing lines. Left side hosts 40px rounded icon container (`#F1F3F5` fill, black line icon); middle holds bold title (`#111111`) and secondary HSN metadata (`#71717A`); right holds bold tabular currency amount (`#111111`).
- **Bill Summary Box:** Container with `#F8F9FA` fill and 1px border. Itemized rows (Subtotal, IGST, Round Off) are separated by hairline borders, ending in an amplified bold `Total` row.

### Android Navigation
- **Top App Bar:** Pure `#FFFFFF` background, 56px height, back chevron (left), title (`headline-sm`, center/left), utility icon cluster (search, notification, share) aligned right.
- **Bottom Navigation Bar:** Pure `#FFFFFF` background, 64px height, 1px top border `#E5E7EB`. Tabs consist of active `#111111` filled icon and bold label, versus inactive `#71717A` outline icon and regular label.