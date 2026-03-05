// Generated from Interfaces.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class InterfacesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, IP=13, WS=14, COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ID", "IP", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'allow-hotplug'", "'iface'", "'inet'", "'inet6'", "'static'", 
			"'dhcp'", "'loopback'", "'address'", "'netmask'", "'gateway'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "IP", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public InterfacesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Interfaces.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0004\u000br\b\u000b\u000b\u000b\f\u000bs\u0001"+
		"\f\u0004\fw\b\f\u000b\f\f\fx\u0001\f\u0001\f\u0004\f}\b\f\u000b\f\f\f"+
		"~\u0001\f\u0001\f\u0004\f\u0083\b\f\u000b\f\f\f\u0084\u0001\f\u0001\f"+
		"\u0004\f\u0089\b\f\u000b\f\f\f\u008a\u0001\r\u0004\r\u008e\b\r\u000b\r"+
		"\f\r\u008f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u0096\b"+
		"\u000e\n\u000e\f\u000e\u0099\t\u000e\u0001\u000e\u0001\u000e\u0000\u0000"+
		"\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\u0004\u0004\u000009AZ__az\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00a2\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001"+
		"\u001f\u0001\u0000\u0000\u0000\u0003$\u0001\u0000\u0000\u0000\u00052\u0001"+
		"\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000"+
		"\u0000\u000bC\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000\u000f"+
		"O\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000\u0013`\u0001"+
		"\u0000\u0000\u0000\u0015h\u0001\u0000\u0000\u0000\u0017q\u0001\u0000\u0000"+
		"\u0000\u0019v\u0001\u0000\u0000\u0000\u001b\u008d\u0001\u0000\u0000\u0000"+
		"\u001d\u0093\u0001\u0000\u0000\u0000\u001f \u0005a\u0000\u0000 !\u0005"+
		"u\u0000\u0000!\"\u0005t\u0000\u0000\"#\u0005o\u0000\u0000#\u0002\u0001"+
		"\u0000\u0000\u0000$%\u0005a\u0000\u0000%&\u0005l\u0000\u0000&\'\u0005"+
		"l\u0000\u0000\'(\u0005o\u0000\u0000()\u0005w\u0000\u0000)*\u0005-\u0000"+
		"\u0000*+\u0005h\u0000\u0000+,\u0005o\u0000\u0000,-\u0005t\u0000\u0000"+
		"-.\u0005p\u0000\u0000./\u0005l\u0000\u0000/0\u0005u\u0000\u000001\u0005"+
		"g\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0005i\u0000\u000034\u0005"+
		"f\u0000\u000045\u0005a\u0000\u000056\u0005c\u0000\u000067\u0005e\u0000"+
		"\u00007\u0006\u0001\u0000\u0000\u000089\u0005i\u0000\u00009:\u0005n\u0000"+
		"\u0000:;\u0005e\u0000\u0000;<\u0005t\u0000\u0000<\b\u0001\u0000\u0000"+
		"\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000\u0000?@\u0005e\u0000\u0000"+
		"@A\u0005t\u0000\u0000AB\u00056\u0000\u0000B\n\u0001\u0000\u0000\u0000"+
		"CD\u0005s\u0000\u0000DE\u0005t\u0000\u0000EF\u0005a\u0000\u0000FG\u0005"+
		"t\u0000\u0000GH\u0005i\u0000\u0000HI\u0005c\u0000\u0000I\f\u0001\u0000"+
		"\u0000\u0000JK\u0005d\u0000\u0000KL\u0005h\u0000\u0000LM\u0005c\u0000"+
		"\u0000MN\u0005p\u0000\u0000N\u000e\u0001\u0000\u0000\u0000OP\u0005l\u0000"+
		"\u0000PQ\u0005o\u0000\u0000QR\u0005o\u0000\u0000RS\u0005p\u0000\u0000"+
		"ST\u0005b\u0000\u0000TU\u0005a\u0000\u0000UV\u0005c\u0000\u0000VW\u0005"+
		"k\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005"+
		"d\u0000\u0000Z[\u0005d\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005e\u0000"+
		"\u0000]^\u0005s\u0000\u0000^_\u0005s\u0000\u0000_\u0012\u0001\u0000\u0000"+
		"\u0000`a\u0005n\u0000\u0000ab\u0005e\u0000\u0000bc\u0005t\u0000\u0000"+
		"cd\u0005m\u0000\u0000de\u0005a\u0000\u0000ef\u0005s\u0000\u0000fg\u0005"+
		"k\u0000\u0000g\u0014\u0001\u0000\u0000\u0000hi\u0005g\u0000\u0000ij\u0005"+
		"a\u0000\u0000jk\u0005t\u0000\u0000kl\u0005e\u0000\u0000lm\u0005w\u0000"+
		"\u0000mn\u0005a\u0000\u0000no\u0005y\u0000\u0000o\u0016\u0001\u0000\u0000"+
		"\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0018"+
		"\u0001\u0000\u0000\u0000uw\u0007\u0001\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0005.\u0000\u0000{}\u0007\u0001"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0082\u0005.\u0000\u0000\u0081\u0083\u0007\u0001\u0000"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0005.\u0000\u0000"+
		"\u0087\u0089\u0007\u0001\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u001a\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0007\u0002\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0006\r\u0000\u0000\u0092\u001c\u0001\u0000\u0000\u0000\u0093"+
		"\u0097\u0005#\u0000\u0000\u0094\u0096\b\u0003\u0000\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0006\u000e\u0000\u0000\u009b\u001e\u0001\u0000\u0000\u0000\b\u0000s"+
		"x~\u0084\u008a\u008f\u0097\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}