/* Generated By:JavaCC: Do not edit this line. IRParserTokenManager.java */
package ir.parser;
import static ir.tree.IR.*;
import util.List;
import translate.ProcFragment;
import translate.Fragments;
import translate.DataFragment;
import ir.frame.Frame;
import ir.tree.*;
import ir.temp.Temp;
import ir.temp.Label;
import ir.frame.x86_64.X86_64Frame;

/** Token Manager. */
@SuppressWarnings("all")
public class IRParserTokenManager implements IRParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 52;
            return 33;
         }
         if ((active0 & 0x1fffefeff80L) != 0L)
         {
            jjmatchedKind = 52;
            return 32;
         }
         return -1;
      case 1:
         if ((active0 & 0x3f0000000L) != 0L)
            return 32;
         if ((active0 & 0x1fc0effff80L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 1;
            return 32;
         }
         return -1;
      case 2:
         if ((active0 & 0xc006efff80L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 2;
            return 32;
         }
         if ((active0 & 0x13c08100000L) != 0L)
            return 32;
         return -1;
      case 3:
         if ((active0 & 0x80028b7f80L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 3;
            return 32;
         }
         if ((active0 & 0x4004648000L) != 0L)
            return 32;
         return -1;
      case 4:
         if ((active0 & 0x16f80L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 4;
            return 32;
         }
         if ((active0 & 0x80028a1000L) != 0L)
            return 32;
         return -1;
      case 5:
         if ((active0 & 0x6980L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 5;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x600L) != 0L)
            return 32;
         return -1;
      case 6:
         if ((active0 & 0x2980L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 6;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x4000L) != 0L)
            return 32;
         return -1;
      case 7:
         if ((active0 & 0x2980L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 7;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x2980L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 8;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x2980L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 9;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x2180L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 10;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x800L) != 0L)
            return 32;
         return -1;
      case 11:
         if ((active0 & 0x2080L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 11;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x100L) != 0L)
            return 32;
         return -1;
      case 12:
         if ((active0 & 0x2080L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 12;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 13;
            return 32;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x80L) != 0L)
            return 32;
         return -1;
      case 14:
         if ((active0 & 0x10000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 52;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x2000L) != 0L)
            return 32;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 41);
      case 41:
         return jjStopAtPos(0, 42);
      case 42:
         return jjStopAtPos(0, 47);
      case 44:
         return jjStopAtPos(0, 46);
      case 58:
         return jjStopAtPos(0, 48);
      case 60:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 61:
         return jjStopAtPos(0, 45);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x2480000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x28000000L);
      case 71:
         return jjMoveStringLiteralDfa1_0(0x240000000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 74:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x90028000L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x18000140080L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x100200000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x3c00000000L);
      case 88:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 123:
         return jjStopAtPos(0, 43);
      case 125:
         return jjStopAtPos(0, 44);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 56:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x620000L);
      case 69:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 32);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(1, 32, 32);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(1, 33, 32);
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 71:
         return jjMoveStringLiteralDfa2_0(active0, 0x2800000000L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000800000L);
      case 74:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x5400000000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0000L);
      case 81:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(1, 29, 32);
         break;
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 84:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(1, 28, 32);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(1, 30, 32);
         break;
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x10004000000L);
      case 88:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1500L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2080L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 54:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 66:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 68:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 69:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 32);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 37, 32);
         break;
      case 76:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 32);
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 77:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 32);
         return jjMoveStringLiteralDfa3_0(active0, 0x4200000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000880000L);
      case 80:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 32);
         break;
      case 84:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 32);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 32);
         break;
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x4002000000L);
      case 86:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x180L);
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(3, 18, 32);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 32);
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 76:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 32);
         break;
      case 77:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 79:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 80:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 32);
         break;
      case 83:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 32);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 95:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x300L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 116:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 32);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 54:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 70:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 76:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 32);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 80:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 32);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 32);
         break;
      case 83:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 39, 32);
         break;
      case 84:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 32);
         break;
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x10400L);
      case 108:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 32);
         break;
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 52:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 97:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 32);
         break;
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 115:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 32);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 70:
         return jjMoveStringLiteralDfa7_0(active0, 0x880L);
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 115:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(6, 14, 32);
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000L);
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000L);
      case 103:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x880L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x880L);
      case 104:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000L);
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000L);
      case 109:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa10_0(active0, 0x2000L);
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x10100L);
      case 103:
         return jjMoveStringLiteralDfa10_0(active0, 0x80L);
      case 109:
         return jjMoveStringLiteralDfa10_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa11_0(active0, 0x10000L);
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(10, 11, 32);
         break;
      case 102:
         return jjMoveStringLiteralDfa11_0(active0, 0x2000L);
      case 109:
         return jjMoveStringLiteralDfa11_0(active0, 0x80L);
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa12_0(active0, 0x80L);
      case 102:
         return jjMoveStringLiteralDfa12_0(active0, 0x2000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(11, 8, 32);
         break;
      case 117:
         return jjMoveStringLiteralDfa12_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa13_0(active0, 0x10000L);
      case 110:
         return jjMoveStringLiteralDfa13_0(active0, 0x80L);
      case 115:
         return jjMoveStringLiteralDfa13_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa14_0(active0, 0x12000L);
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(13, 7, 32);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa15_0(active0, 0x10000L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(14, 13, 32);
         break;
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 58:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(15, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 33;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 33:
                  if ((0x3ff401000000000L & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     jjCheckNAdd(32);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAdd(30);
                  }
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 49)
                        kind = 49;
                     jjCheckNAdd(10);
                  }
                  else if (curChar == 37)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 45)
                     jjCheckNAdd(10);
                  else if (curChar == 35)
                  {
                     if (kind > 6)
                        kind = 6;
                     jjCheckNAdd(8);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 42)
                     jjCheckNAddStates(0, 2);
                  break;
               case 3:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 4:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 5:
                  if (curChar == 47 && kind > 5)
                     kind = 5;
                  break;
               case 7:
                  if (curChar != 35)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(8);
                  break;
               case 8:
                  if ((0xfffffffffffffbffL & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(8);
                  break;
               case 9:
                  if (curChar == 45)
                     jjCheckNAdd(10);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 49)
                     kind = 49;
                  jjCheckNAdd(10);
                  break;
               case 15:
                  if ((0x300000000000000L & l) != 0L && kind > 50)
                     kind = 50;
                  break;
               case 21:
                  if (curChar == 49)
                     jjAddStates(3, 8);
                  break;
               case 22:
                  if (curChar == 48 && kind > 50)
                     kind = 50;
                  break;
               case 23:
                  if (curChar == 49 && kind > 50)
                     kind = 50;
                  break;
               case 24:
                  if (curChar == 50 && kind > 50)
                     kind = 50;
                  break;
               case 25:
                  if (curChar == 51 && kind > 50)
                     kind = 50;
                  break;
               case 26:
                  if (curChar == 52 && kind > 50)
                     kind = 50;
                  break;
               case 27:
                  if (curChar == 53 && kind > 50)
                     kind = 50;
                  break;
               case 28:
                  if (curChar == 37)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(30);
                  break;
               case 32:
                  if ((0x3ff401000000000L & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(32);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 33:
               case 32:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(32);
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 52)
                        kind = 52;
                     jjCheckNAdd(32);
                  }
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 1:
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
               case 4:
                  jjCheckNAddTwoStates(4, 2);
                  break;
               case 8:
                  if (kind > 6)
                     kind = 6;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 11:
                  if (curChar == 114)
                     jjAddStates(9, 15);
                  break;
               case 12:
                  if (curChar == 120 && kind > 50)
                     kind = 50;
                  break;
               case 13:
                  if (curChar == 97)
                     jjCheckNAdd(12);
                  break;
               case 14:
                  if (curChar == 99)
                     jjCheckNAdd(12);
                  break;
               case 16:
                  if (curChar == 98)
                     jjCheckNAddTwoStates(12, 17);
                  break;
               case 17:
                  if (curChar == 112 && kind > 50)
                     kind = 50;
                  break;
               case 18:
                  if (curChar == 100)
                     jjCheckNAddTwoStates(12, 19);
                  break;
               case 19:
                  if (curChar == 105 && kind > 50)
                     kind = 50;
                  break;
               case 20:
                  if (curChar == 115)
                     jjCheckNAddTwoStates(19, 17);
                  break;
               case 29:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 31:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 52)
                     kind = 52;
                  jjCheckNAdd(32);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(4, 2);
                  break;
               case 8:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 33 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   2, 3, 5, 22, 23, 24, 25, 26, 27, 13, 14, 15, 16, 18, 20, 21, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, 
"\115\145\164\150\157\144\106\162\141\147\155\145\156\164", "\104\141\164\141\106\162\141\147\155\145\156\164", 
"\111\122\104\141\164\141", "\166\141\154\165\145\163", "\130\70\66\137\66\64\106\162\141\155\145", 
"\154\141\142\145\154", "\156\145\170\164\114\157\143\141\154\117\146\146\163\145\164", 
"\146\157\162\155\141\154\163", "\114\151\163\164", 
"\164\162\141\143\145\40\163\143\150\145\144\165\154\145\144\72", "\114\101\102\105\114", "\115\117\126\105", "\103\117\116\123\124", 
"\115\105\115", "\116\101\115\105", "\103\101\114\114", "\102\111\116\117\120", "\74\55", 
"\103\112\125\115\120", "\112\125\115\120", "\105\130\120", "\114\124", "\105\121", "\107\124", 
"\114\105", "\116\105", "\107\105", "\125\114\124", "\125\107\124", "\125\114\105", 
"\125\107\105", "\120\114\125\123", "\115\111\116\125\123", "\115\125\114", "\50", "\51", 
"\173", "\175", "\75", "\54", "\52", "\72", null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[33];
private final int[] jjstateSet = new int[66];
protected char curChar;
/** Constructor. */
public IRParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public IRParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 33; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}