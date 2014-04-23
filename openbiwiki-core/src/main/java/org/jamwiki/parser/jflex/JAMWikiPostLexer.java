/* The following code was generated by JFlex 1.5.1 */

/*
 * This class handles references, TOC insertion, and other elements that require
 * pre-processing before they can be fully parsed.
 */
package org.jamwiki.parser.jflex;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.1
 * from the specification file <tt>jamwiki-postprocessor.jflex</tt>
 */
public class JAMWikiPostLexer extends JFlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int PRE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\26\1\1\1\32\1\0\1\32\22\0\1\31\16\0\1\11"+
    "\14\0\1\2\1\27\1\10\2\0\1\14\1\0\1\20\1\22\1\17"+
    "\1\30\1\23\1\0\1\6\1\0\1\7\1\21\1\0\1\3\1\4"+
    "\1\13\1\0\1\15\1\16\1\24\2\0\1\5\1\0\1\25\5\0"+
    "\1\12\1\0\1\14\1\0\1\20\1\22\1\17\1\30\1\23\1\0"+
    "\1\6\1\0\1\7\1\21\1\0\1\3\1\4\1\13\1\0\1\15"+
    "\1\16\1\24\2\0\1\5\1\0\1\25\13\0\1\32\252\0\2\6"+
    "\115\0\1\16\u1ea8\0\1\32\1\32\u0100\0\1\7\uded5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\5\1\30\0\1\2\21\0\1\3\12\0\1\4"+
    "\11\0\1\4\31\0\1\5\7\0\1\6\1\0\1\7"+
    "\5\0\1\10";

  private static int [] zzUnpackAction() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\33\0\66\0\121\0\154\0\207\0\242\0\207"+
    "\0\275\0\330\0\363\0\u010e\0\u0129\0\u0144\0\u015f\0\u017a"+
    "\0\u0195\0\u01b0\0\u01cb\0\u01e6\0\u0201\0\u021c\0\u0237\0\u0252"+
    "\0\u026d\0\u0288\0\u02a3\0\u02be\0\u02d9\0\u02f4\0\u030f\0\66"+
    "\0\u032a\0\u0345\0\u0360\0\u037b\0\u0396\0\u03b1\0\u03cc\0\u03e7"+
    "\0\u0402\0\u041d\0\u0438\0\u0453\0\u046e\0\u0489\0\u04a4\0\u04bf"+
    "\0\u04da\0\66\0\u04f5\0\u0510\0\u052b\0\u0546\0\u0561\0\u057c"+
    "\0\u0597\0\u05b2\0\u05cd\0\u05e8\0\u0603\0\u061e\0\u0639\0\u0654"+
    "\0\u066f\0\u068a\0\u06a5\0\u06c0\0\u06db\0\u06f6\0\66\0\u0711"+
    "\0\u072c\0\u0747\0\u0762\0\u077d\0\u0798\0\u07b3\0\u07ce\0\u07e9"+
    "\0\u0804\0\u081f\0\u083a\0\u0855\0\u0870\0\u088b\0\u08a6\0\u08c1"+
    "\0\u08dc\0\u08f7\0\u0912\0\u092d\0\u0948\0\u0963\0\u097e\0\u0999"+
    "\0\66\0\u09b4\0\u09cf\0\u09ea\0\u0a05\0\u0a20\0\u0a3b\0\u0a56"+
    "\0\66\0\u0a71\0\66\0\u0a8c\0\u0aa7\0\u0ac2\0\u0add\0\u0af8"+
    "\0\66";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\7\3\1\6\17\3\1\0\2\3"+
    "\1\7\27\3\46\0\1\10\23\0\1\11\6\0\1\12"+
    "\1\13\1\0\1\14\1\15\26\0\1\16\23\0\1\11"+
    "\5\0\1\17\1\12\24\0\1\20\40\0\1\21\35\0"+
    "\1\22\34\0\1\23\33\0\1\24\36\0\1\25\21\0"+
    "\1\26\24\0\1\27\30\0\1\30\46\0\1\31\43\0"+
    "\1\32\17\0\1\33\21\0\1\34\43\0\1\35\23\0"+
    "\1\36\30\0\1\37\36\0\1\40\1\41\14\0\1\42"+
    "\2\0\1\42\20\0\1\43\21\0\1\44\44\0\1\45"+
    "\31\0\1\46\22\0\1\47\36\0\1\50\27\0\1\40"+
    "\30\0\1\51\1\0\1\40\1\41\4\0\1\52\1\0"+
    "\1\53\1\54\1\55\1\0\1\56\1\0\1\42\2\0"+
    "\1\42\16\0\1\57\30\0\1\60\31\0\1\61\30\0"+
    "\1\62\30\0\1\63\40\0\1\64\40\0\1\65\34\0"+
    "\1\66\27\0\1\67\25\0\1\70\24\0\1\71\32\0"+
    "\1\72\43\0\1\73\37\0\1\74\20\0\1\75\30\0"+
    "\1\76\37\0\1\77\25\0\1\40\1\41\14\0\1\100"+
    "\1\101\1\0\1\100\26\0\1\102\21\0\1\103\21\0"+
    "\1\104\44\0\1\65\41\0\1\102\11\0\1\105\27\0"+
    "\10\74\1\106\22\74\1\0\1\107\31\0\2\76\1\110"+
    "\30\76\16\0\1\111\22\0\1\51\1\0\1\40\1\41"+
    "\4\0\1\52\1\0\1\53\1\54\1\55\1\0\1\56"+
    "\1\0\1\100\1\101\1\0\1\100\1\0\1\112\1\0"+
    "\6\112\1\0\22\112\21\0\1\113\27\0\1\114\37\0"+
    "\1\65\27\0\1\115\12\0\2\106\1\116\30\106\2\76"+
    "\1\110\6\76\1\117\21\76\17\0\1\120\13\0\1\112"+
    "\1\0\6\112\1\40\22\112\17\0\1\65\31\0\1\65"+
    "\33\0\1\121\13\0\2\106\1\116\6\106\1\122\21\106"+
    "\2\76\1\110\1\123\27\76\10\0\1\124\40\0\1\125"+
    "\14\0\2\106\1\116\13\106\1\126\14\106\2\76\1\110"+
    "\1\76\1\127\26\76\2\124\1\130\30\124\31\0\1\131"+
    "\1\0\2\106\1\116\15\106\1\132\12\106\2\76\1\110"+
    "\2\76\1\133\25\76\2\124\1\130\6\124\1\134\21\124"+
    "\11\0\1\135\21\0\2\106\1\116\12\106\1\136\15\106"+
    "\2\76\1\110\3\76\1\137\24\76\2\124\1\130\7\124"+
    "\1\140\20\124\10\0\1\141\22\0\2\106\1\116\3\106"+
    "\1\142\24\106\2\76\1\110\4\76\1\143\23\76\2\124"+
    "\1\130\7\124\1\144\20\124\2\106\1\116\10\106\1\145"+
    "\17\106\2\76\1\110\3\76\1\146\24\76\2\124\1\130"+
    "\1\147\27\124\2\106\1\116\21\106\1\150\6\106\2\76"+
    "\1\110\5\76\1\151\22\76\2\124\1\130\1\124\1\152"+
    "\26\124\2\106\1\116\5\106\1\153\22\106\2\124\1\130"+
    "\10\124\1\154\21\124\1\130\11\124\1\155\20\124\1\130"+
    "\12\124\1\156\17\124\1\130\13\124\1\157\16\124\1\130"+
    "\14\124\1\160\15\124\1\130\5\124\1\161\22\124";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2835];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\4\1\30\0\1\11\21\0\1\11\12\0"+
    "\1\1\11\0\1\11\31\0\1\11\7\0\1\11\1\0"+
    "\1\11\5\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public JAMWikiPostLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public JAMWikiPostLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 156) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public String yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { // no need to log this
        return yytext();
          }
        case 9: break;
        case 2: 
          { if (logger.isTraceEnabled()) logger.trace("htmlprestart: " + yytext() + " (" + yystate() + ")");
        beginState(PRE);
        return yytext();
          }
        case 10: break;
        case 3: 
          { if (logger.isTraceEnabled()) logger.trace("htmlpreend: " + yytext() + " (" + yystate() + ")");
        endState();
        return yytext();
          }
        case 11: break;
        case 4: 
          { if (logger.isTraceEnabled()) logger.trace("toc: " + yytext() + " (" + yystate() + ")");
        return this.parserInput.getTableOfContents().attemptTOCInsertion(this.parserInput, yytext());
          }
        case 12: break;
        case 5: 
          { if (logger.isTraceEnabled()) logger.trace("references: " + yytext() + " (" + yystate() + ")");
        return this.parse(TAG_TYPE_WIKI_REFERENCES, yytext());
          }
        case 13: break;
        case 6: 
          { if (logger.isTraceEnabled()) logger.trace("nowiki: " + yytext() + " (" + yystate() + ")");
        return JFlexParserUtil.tagContent(yytext());
          }
        case 14: break;
        case 7: 
          { if (logger.isTraceEnabled()) logger.trace("javascript: " + yytext() + " (" + yystate() + ")");
        // javascript tags are parsed in the processor step, but parse again here as a security
        // check against potential XSS attacks.
        return this.parse(TAG_TYPE_JAVASCRIPT, yytext());
          }
        case 15: break;
        case 8: 
          { if (logger.isTraceEnabled()) logger.trace("noparse: " + yytext() + " (" + yystate() + ")");
        return this.parse(TAG_TYPE_NO_PARSE, yytext());
          }
        case 16: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}