package LanguageHTML.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AnchorElement = 0;
  public static final int Body = 1;
  public static final int BodyElement = 2;
  public static final int DivElement = 3;
  public static final int Document = 4;
  public static final int Head = 5;
  public static final int HeadChild = 6;
  public static final int HtmlDocument = 7;
  public static final int HtmlElement = 8;
  public static final int ParagraphElement = 9;
  public static final int SpanElement = 10;
  public static final int TextElement = 11;
  public static final int TitleElement = 12;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xcfdb8e6e45b145d3L, 0xa650bdfedc3caeb8L);
    builder.put(0x2263eb887a872acaL, AnchorElement);
    builder.put(0x7a7699b586cbaa23L, Body);
    builder.put(0x2263eb887a868235L, BodyElement);
    builder.put(0x2263eb887a871eeeL, DivElement);
    builder.put(0x2263eb887a86cc2fL, Document);
    builder.put(0x7a7699b586cba882L, Head);
    builder.put(0x2263eb887a8704b9L, HeadChild);
    builder.put(0x2263eb887a867ce3L, HtmlDocument);
    builder.put(0x2263eb887a86e354L, HtmlElement);
    builder.put(0x2263eb887a872889L, ParagraphElement);
    builder.put(0x2263eb887a87248dL, SpanElement);
    builder.put(0x2263eb887a86a58bL, TextElement);
    builder.put(0x2263eb887a870e67L, TitleElement);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}