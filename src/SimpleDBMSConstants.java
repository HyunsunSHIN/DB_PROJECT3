/* Generated By:JavaCC: Do not edit this line. SimpleDBMSConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface SimpleDBMSConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int _SPACE = 4;
  /** RegularExpression Id. */
  int SEMICOLON = 8;
  /** RegularExpression Id. */
  int UNDERSCORE = 9;
  /** RegularExpression Id. */
  int LEFT_PAREN = 10;
  /** RegularExpression Id. */
  int RIGHT_PAREN = 11;
  /** RegularExpression Id. */
  int COMMA = 12;
  /** RegularExpression Id. */
  int PERIOD = 13;
  /** RegularExpression Id. */
  int COMP_OP = 14;
  /** RegularExpression Id. */
  int DIGIT = 15;
  /** RegularExpression Id. */
  int SIGN = 16;
  /** RegularExpression Id. */
  int QUOTE = 17;
  /** RegularExpression Id. */
  int NON_QUOTE_SPECIAL_CHARACTERS = 18;
  /** RegularExpression Id. */
  int ALPHABET = 19;
  /** RegularExpression Id. */
  int SPACE = 20;
  /** RegularExpression Id. */
  int SPACES = 21;
  /** RegularExpression Id. */
  int EXIT = 22;
  /** RegularExpression Id. */
  int CREATE_TABLE = 23;
  /** RegularExpression Id. */
  int NOT_NULL = 24;
  /** RegularExpression Id. */
  int PRIMARY_KEY = 25;
  /** RegularExpression Id. */
  int FOREIGN_KEY = 26;
  /** RegularExpression Id. */
  int REFERENCES = 27;
  /** RegularExpression Id. */
  int INT = 28;
  /** RegularExpression Id. */
  int CHAR = 29;
  /** RegularExpression Id. */
  int DATE = 30;
  /** RegularExpression Id. */
  int DROP_TABLE = 31;
  /** RegularExpression Id. */
  int SHOW_TABLES = 32;
  /** RegularExpression Id. */
  int DESC = 33;
  /** RegularExpression Id. */
  int SELECT = 34;
  /** RegularExpression Id. */
  int AS = 35;
  /** RegularExpression Id. */
  int FROM = 36;
  /** RegularExpression Id. */
  int WHERE = 37;
  /** RegularExpression Id. */
  int AND = 38;
  /** RegularExpression Id. */
  int OR = 39;
  /** RegularExpression Id. */
  int NOT = 40;
  /** RegularExpression Id. */
  int IS_NULL = 41;
  /** RegularExpression Id. */
  int IS_NOT_NULL = 42;
  /** RegularExpression Id. */
  int INSERT_INTO = 43;
  /** RegularExpression Id. */
  int VALUES = 44;
  /** RegularExpression Id. */
  int NULL = 45;
  /** RegularExpression Id. */
  int DELETE_FROM = 46;
  /** RegularExpression Id. */
  int LEGAL_IDENTIFIER = 47;
  /** RegularExpression Id. */
  int INT_VALUE = 48;
  /** RegularExpression Id. */
  int DATE_VALUE = 49;
  /** RegularExpression Id. */
  int CHAR_STRING = 50;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\";\\r\"",
    "\";\\n\"",
    "\"*\"",
    "<_SPACE>",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\";\"",
    "\"_\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\".\"",
    "<COMP_OP>",
    "<DIGIT>",
    "<SIGN>",
    "\"\\\'\"",
    "<NON_QUOTE_SPECIAL_CHARACTERS>",
    "<ALPHABET>",
    "\" \"",
    "<SPACES>",
    "\"exit\"",
    "\"create table\"",
    "\"not null\"",
    "\"primary key\"",
    "\"foreign key\"",
    "\"references\"",
    "\"int\"",
    "\"char\"",
    "\"date\"",
    "\"drop table\"",
    "\"show tables\"",
    "\"desc\"",
    "\"select\"",
    "\"as\"",
    "\"from\"",
    "\"where\"",
    "\"and\"",
    "\"or\"",
    "\"not\"",
    "\"is null\"",
    "\"is not null\"",
    "\"insert into\"",
    "\"values\"",
    "\"null\"",
    "\"delete from\"",
    "<LEGAL_IDENTIFIER>",
    "<INT_VALUE>",
    "<DATE_VALUE>",
    "<CHAR_STRING>",
  };

}