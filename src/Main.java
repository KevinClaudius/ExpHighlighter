
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import output.ExpLexer;
import output.ExpParser;
import output.ExpWalker;

/**
 * @author Gabe Johnson <johnsogg@cmu.edu>, Kevin Page
 */
public class Main {
  public Properties classNames = new Properties(); // maps token names to css class names
  public String outFile; // name of the output file
  public String programString; // the unmodified source string.
  private File baseDir;
  private static final String styleSheetName = "styles.css";

  enum FontStyle {
    plain, italic, bold, both
  }

  public Main() {
//    styles = new Properties();
//    styles.put("function name", mkStyle("#600", null, FontStyle.plain));
//    styles.put("assign lval", mkStyle("#390", null, FontStyle.plain));
//    styles.put("member lval", mkStyle("#003", null, FontStyle.plain));
//    styles.put("constructor name", mkStyle("#660", null, FontStyle.plain));
//    styles.put("class name", mkStyle("#660", null, FontStyle.bold));
//    styles.put("extends class name", mkStyle("#660", null, FontStyle.plain));
//    styles.put("formal param", mkStyle("#60c", null, FontStyle.italic));
//    styles.put("class def name", mkStyle("#606", null, FontStyle.both));
//    styles.put("function def name", mkStyle("#606", null, FontStyle.both));
//    styles.put("field declaration", mkStyle("#606", null, FontStyle.both));

    // token types
    
    classNames.put("NUMBER", "exp_number");
    classNames.put("ADD", "exp_plus");
    classNames.put("LPAREN", "exp_paren");
    classNames.put("RPAREN", "exp_paren");
    classNames.put("FUNCNAME", "exp_funcname");
    classNames.put("EXP", "exp_pow");
    classNames.put("PV", "exp_pv");
    classNames.put("VARIABLE", "exp_pv");
    classNames.put("STRING", "exp_string");

//    styles.put("COMMA", mkStyle("#300", null, FontStyle.plain));
//    styles.put("MINUS", mkStyle("#060", null, FontStyle.plain));
//    styles.put("HASH", mkStyle("#060", null, FontStyle.plain));
//    styles.put("PERCENT", mkStyle("#060", null, FontStyle.plain));
//    styles.put("LPAR", mkStyle("#300", null, FontStyle.plain));
//    styles.put("MIXES", mkStyle("#000", null, FontStyle.plain));
//    styles.put("FALSE", mkStyle("#000", null, FontStyle.plain));
//    styles.put("DONE", mkStyle("#000", null, FontStyle.plain));
//    styles.put("IMPORT", mkStyle("#000", null, FontStyle.plain));
//    styles.put("OR", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("DOT", mkStyle("#000", null, FontStyle.bold));
//    styles.put("AND", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("STR_LITERAL", mkStyle("#c60", null, FontStyle.italic));
//    styles.put("PLUS", mkStyle("#060", null, FontStyle.plain));
//    styles.put("EXTENDS", mkStyle("#000", null, FontStyle.plain));
//    styles.put("ID", mkStyle("#000", null, FontStyle.italic));
//    styles.put("NEQ", mkStyle("#060", null, FontStyle.plain));
//    styles.put("LCB", mkStyle("#300", null, FontStyle.plain));
//    styles.put("RPAR", mkStyle("#300", null, FontStyle.plain));
//    styles.put("RCB", mkStyle("#300", null, FontStyle.plain));
//    styles.put("WHILE", mkStyle("#000", null, FontStyle.plain));
//    styles.put("LSB", mkStyle("#300", null, FontStyle.plain));
//    styles.put("NEW", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("EQ", mkStyle("#060", null, FontStyle.plain));
//    styles.put("LOOP", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("LT", mkStyle("#060", null, FontStyle.plain));
//    styles.put("GT", mkStyle("#060", null, FontStyle.plain));
//    styles.put("LINE_COMMENT", mkStyle("#093", null, FontStyle.italic));
//    styles.put("GTEQ", mkStyle("#060", null, FontStyle.plain));
//    styles.put("EQEQ", mkStyle("#060", null, FontStyle.plain));
//    styles.put("LAMBDA", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("CLASS", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("DEFINE", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("ELSE", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("IF", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("LTEQ", mkStyle("#060", null, FontStyle.plain));
//    styles.put("CODESET", mkStyle("#000", null, FontStyle.bold));
//    styles.put("NUM", mkStyle("#000", null, FontStyle.plain));
//    styles.put("ASTERISK", mkStyle("#060", null, FontStyle.plain));
//    styles.put("COLON", mkStyle("#c00", null, FontStyle.bold));
//    styles.put("RSB", mkStyle("#300", null, FontStyle.plain));
//    styles.put("NOT", mkStyle("#20f", null, FontStyle.plain));
//    styles.put("TRUE", mkStyle("#000", null, FontStyle.plain));
  }

  public static void main(String[] args) throws Exception {
    // testing
    args = new String[]{"basic_0_hello_world.slippy", "test.html"};
    
    String inFile = null;
    String outFile = null;
    String propFile = null;
    boolean preamble = true;
    if (args.length == 0) {
      bug("SlippyHtmlSyntaxColorizer [--propfile=somefile.properties] "
          + " [--make-propfile] [--no-preamble] [inFile outFile]");
      bug("\t--propfile=somefile.properties\tUse this to specify the color file.");
      bug("\t--make-propfile\t\tGenerate a template color file to edit (capture stdout)");
      bug("\t--no-preamble\t\tDisables the HTML/HEAD/BODY tags in the output.");
      bug("\tinFile outFile\t\tSpecify the input and output file names.");
      System.exit(0);
    }
    for (int i = 0; i < args.length; i++) {
      if (args[i].startsWith("--propfile=")) {
        propFile = args[i].substring("--propfile=".length());
      } else if (args[i].equals("--make-propfile")) {
        throw new UnsupportedOperationException("I broke --make-propfile");
//        Main colorizer = new Main();
//        colorizer.styles.store(System.out, "Syntax style sheet for SlippyHtmlSyntaxColorizer.");
      } else if (args[i].equals("--no-preamble")) {
        preamble = false;
      } else if (inFile == null) {
        inFile = args[i];
      } else {
        outFile = args[i];
      }
    }

    if (inFile != null && outFile == null) {
      int idx = inFile.indexOf(".slippy");
      if (idx > 0) {
        outFile = inFile.substring(0, idx) + ".html";
        bug("using " + outFile);
      }
    }

    if (inFile != null && outFile != null) {
      Main colorizer = new Main();
//      if (propFile != null) {
//        colorizer.setStyleProperties(propFile);
//      }
      colorizer.setOutFile(outFile);
      colorizer.walk(inFile, preamble);
    }
  }

//  public void setStyleProperties(String propFile) throws FileNotFoundException, IOException {
//    styles = new Properties();
//    styles.load(new FileInputStream(propFile));
//  }
  
  public void setOutFile(String outFile) {
    this.outFile = outFile;
  }
  
  public void setBaseDir(String path) {
    setBaseDir(new File(path));
  }
  public void setBaseDir(File baseDir) {
    this.baseDir = baseDir;
  }
  
  public File getFile(String pathFragment) {
    File ret = null;
    if (baseDir == null) {
      ret = new File(pathFragment);
    } else {
      ret = new File(baseDir, pathFragment);
    }
    return ret;
  }

  @SuppressWarnings("unchecked")
  public String walk(String inFile, boolean preamble) throws Exception {
    File file = getFile(inFile);
    if (!file.exists()) {
      bug("Can't locate file: " + file.getAbsolutePath());
    }
    programString = readFileAsString(inFile);
    CharStream cs = new ANTLRStringStream(programString);
    ExpLexer myLexer = new ExpLexer(cs);
    CommonTokenStream tokens = new CommonTokenStream(myLexer);
    ExpParser myParser = new ExpParser(tokens);
    CommonTree root = (CommonTree) myParser.formula().getTree();
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(root);
    nodes.setTokenStream(tokens);
//    ExpWalker walker = new ExpWalker(nodes);
//    walker.walk();
    List<CommonToken> toks = (List<CommonToken>) tokens.getTokens();
    //Map<Integer, String> tokenTypes = new HashMap<Integer, String>();
//    Set<Map.Entry<CommonTree, String>> entries = walker.specialThings.entrySet();
//    for (Map.Entry<CommonTree, String> en : entries) {
//      int start = en.getKey().getTokenStartIndex();
//      int end = en.getKey().getTokenStopIndex();
//      for (int i = start; i <= end; i++) {
//        tokenTypes.put(i, en.getValue());
//      }
//    }

    StringBuilder buf = new StringBuilder();
    if (preamble) {
      buf.append("<html><head><title>" + inFile + "</title><link rel=\"stylesheet\" href=\"" + styleSheetName + "\" /> </head><body>\n");
    }
    buf.append("<pre style=\"color: #000\">");
    for (int i = 0; i < toks.size(); i++) {
      CommonToken t = toks.get(i);
//      if (tokenTypes.containsKey(i)) {
//        String styleString = styles.getProperty(tokenTypes.get(i));
//        if (styleString != null) {
//          buf.append("<span style=\"" + styleString + "\">" + t.getText() + "</span>");
//        } else {
//          bug("No color (yet) for special token type " + t.getType());
//          buf.append(t.getText());
//        }
//      } else {
        buf.append(getColoredToken(t));
//      }
    }
    buf.append("</pre>");
    if (preamble) {
      buf.append("\n</body></html>\n");
    }

    String ret = buf.toString();
    if (this.outFile != null) {
      try {
        BufferedWriter out = new BufferedWriter(new FileWriter(this.outFile));
        out.write(ret);
        out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return ret;
  }

  public String getColoredToken(CommonToken t) {
    String ret = "";
    String tokenName = ExpWalker.tokenNames[t.getType()];
    String className = classNames.getProperty(tokenName);
    if (className != null) {
      ret = "<span class=\"" + className + "\">" + t.getText() + "</span>";
    } else {
      ret = t.getText();
    }
    return ret;
  }

  public static void bug(String what) {
    System.out.println(what);
  }

  private static String readFileAsString(String filePath) throws java.io.IOException{
      StringBuffer fileData = new StringBuffer(1000);
      BufferedReader reader = new BufferedReader(
              new FileReader(filePath));
      char[] buf = new char[1024];
      int numRead=0;
      while((numRead=reader.read(buf)) != -1){
          String readData = String.valueOf(buf, 0, numRead);
          fileData.append(readData);
          buf = new char[1024];
      }
      reader.close();
      return fileData.toString();
  }
}