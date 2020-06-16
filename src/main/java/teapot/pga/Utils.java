package teapot.pga;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

public class Utils {
    public static String formatNumber(long num, int len) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sb.append(" ");
        }
        sb.append(num);
        return sb.substring(sb.length() - len - 1, sb.length());
    }
    public static String formatString(String msg, int len) {
        StringBuffer sb = new StringBuffer();
        sb.append(msg);
        for (int i = 0; i < len; i++) {
            sb.append(" ");
        }
        return sb.substring(0, len - 1);
    }
    
    

    public static boolean isBinary(File file) {
        boolean isBinary = false;
        try {
            FileInputStream fin = new FileInputStream(file);
            long len = file.length(); 
            for (int j = 0; j < (int) len; j++) {
                int t = fin.read();
                if (t < 32 && t != 9 && t != 10 && t != 13) {
                    isBinary = true;
                    break;
                }
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isBinary;
    }

    private static HashMap<String, Integer> exNameId = new HashMap<String, Integer>();
    static {
        exNameId.put("ABAP", 10001); // ABAP
        exNameId.put("AS", 10002); // ActionScript
        exNameId.put("ADA", 10003); // Ada
        exNameId.put("ADB", 10003); // Ada
        exNameId.put("ADS", 10003); // Ada
        exNameId.put("PAD", 10003); // Ada
        exNameId.put("ADSO", 10004); // ADSO/IDSM
        exNameId.put("AGDA", 10005); // Agda
        exNameId.put("LAGDA", 10005); // Agda
        exNameId.put("AMPLE", 10006); // AMPLE
        exNameId.put("DOFILE", 10006); // AMPLE
        exNameId.put("STARTUP", 10006); // AMPLE
        exNameId.put("BUILD.XML", 10007); // Ant
        exNameId.put("BUILD.XML", 10007); // Ant
        exNameId.put("G", 10008); // ANTLRGrammar
        exNameId.put("G4", 10008); // ANTLRGrammar
        exNameId.put("CLS", 10009); // ApexClass
        exNameId.put("TRIGGER", 10010); // ApexTrigger
        exNameId.put("APL", 10011); // APL
        exNameId.put("APLA", 10011); // APL
        exNameId.put("APLC", 10011); // APL
        exNameId.put("APLF", 10011); // APL
        exNameId.put("APLI", 10011); // APL
        exNameId.put("APLN", 10011); // APL
        exNameId.put("APLO", 10011); // APL
        exNameId.put("DYALOG", 10011); // APL
        exNameId.put("DYAPP", 10011); // APL
        exNameId.put("MIPAGE", 10011); // APL
        exNameId.put("INO", 10012); // ArduinoSketch
        exNameId.put("PDE", 10012); // ArduinoSketch
        exNameId.put("ADOC", 10013); // AsciiDoc
        exNameId.put("ASCIIDOC", 10013); // AsciiDoc
        exNameId.put("ASA", 10014); // ASP
        exNameId.put("ASHX", 10014); // ASP
        exNameId.put("ASP", 10014); // ASP
        exNameId.put("AXD", 10014); // ASP
        exNameId.put("ASAX", 10015); // ASP.NET
        exNameId.put("ASCX", 10015); // ASP.NET
        exNameId.put("ASMX", 10015); // ASP.NET
        exNameId.put("ASPX", 10015); // ASP.NET
        exNameId.put("MASTER", 10015); // ASP.NET
        exNameId.put("SITEMAP", 10015); // ASP.NET
        exNameId.put("WEBINFO", 10015); // ASP.NET
        exNameId.put("AJ", 10016); // AspectJ
        exNameId.put("A51", 10017); // Assembly
        exNameId.put("ASM", 10017); // Assembly
        exNameId.put("NASM", 10017); // Assembly
        exNameId.put("S", 10017); // Assembly
        exNameId.put("S", 10017); // Assembly
        exNameId.put("AHK", 10018); // AutoHotkey
        exNameId.put("AHKL", 10018); // AutoHotkey
        exNameId.put("AUK", 10019); // awk
        exNameId.put("AWK", 10019); // awk
        exNameId.put("GAWK", 10019); // awk
        exNameId.put("MAWK", 10019); // awk
        exNameId.put("NAWK", 10019); // awk
        exNameId.put("BAZEL", 10020); // Bazel
        exNameId.put("BUILD", 10020); // Bazel
        exNameId.put("BLADE", 10021); // Blade
        exNameId.put("BLADE.PHP", 10021); // Blade
        exNameId.put("BASH", 10022); // BourneAgainShell
        exNameId.put("SH", 10023); // BourneShell
        exNameId.put("BRS", 10024); // BrightScript
        exNameId.put("XML.BUILDER", 10025); // builder
        exNameId.put("C", 10026); // C
        exNameId.put("CATS", 10026); // C
        exNameId.put("EC", 10026); // C
        exNameId.put("IDC", 10026); // C
        exNameId.put("PGC", 10026); // C
        exNameId.put("CSH", 10027); // CShell
        exNameId.put("TCSH", 10027); // CShell
        exNameId.put("CS", 10028); // C#
        exNameId.put("C", 10029); // C++
        exNameId.put("C++", 10029); // C++
        exNameId.put("CC", 10029); // C++
        exNameId.put("CPP", 10029); // C++
        exNameId.put("CPP", 10029); // C++
        exNameId.put("CXX", 10029); // C++
        exNameId.put("H++", 10029); // C++
        exNameId.put("INL", 10029); // C++
        exNameId.put("IPP", 10029); // C++
        exNameId.put("PCC", 10029); // C++
        exNameId.put("TCC", 10029); // C++
        exNameId.put("TPP", 10029); // C++
        exNameId.put("H", 10030); // C/C++Header
        exNameId.put("H", 10030); // C/C++Header
        exNameId.put("HH", 10030); // C/C++Header
        exNameId.put("HPP", 10030); // C/C++Header
        exNameId.put("HXX", 10030); // C/C++Header
        exNameId.put("CCS", 10031); // CCS
        exNameId.put("CHPL", 10032); // Chapel
        exNameId.put("DCL", 10033); // Clean
        exNameId.put("ICL", 10033); // Clean
        exNameId.put("BOOT", 10034); // Clojure
        exNameId.put("CL2", 10034); // Clojure
        exNameId.put("CLJ", 10034); // Clojure
        exNameId.put("CLJS.HL", 10034); // Clojure
        exNameId.put("CLJSCM", 10034); // Clojure
        exNameId.put("CLJX", 10034); // Clojure
        exNameId.put("HIC", 10034); // Clojure
        exNameId.put("RIEMANN.CONFIG", 10034); // Clojure
        exNameId.put("CLJC", 10035); // ClojureC
        exNameId.put("CLJS", 10036); // ClojureScript
        exNameId.put("CMAKE", 10037); // CMake
        exNameId.put("CMAKE.IN", 10037); // CMake
        exNameId.put("CMAKELISTS.TXT", 10037); // CMake
        exNameId.put("CBL", 10038); // COBOL
        exNameId.put("CBL", 10038); // COBOL
        exNameId.put("CCP", 10038); // COBOL
        exNameId.put("COB", 10038); // COBOL
        exNameId.put("COB", 10038); // COBOL
        exNameId.put("COBOL", 10038); // COBOL
        exNameId.put("CPY", 10038); // COBOL
        exNameId.put("_COFFEE", 10039); // CoffeeScript
        exNameId.put("CAKEFILE", 10039); // CoffeeScript
        exNameId.put("CJSX", 10039); // CoffeeScript
        exNameId.put("COFFEE", 10039); // CoffeeScript
        exNameId.put("ICED", 10039); // CoffeeScript
        exNameId.put("CFM", 10040); // ColdFusion
        exNameId.put("CFML", 10040); // ColdFusion
        exNameId.put("CFC", 10041); // ColdFusionCFScript
        exNameId.put("V", 10042); // Coq
        exNameId.put("CR", 10043); // Crystal
        exNameId.put("CSON", 10044); // CSON
        exNameId.put("CSS", 10045); // CSS
        exNameId.put("FEATURE", 10046); // Cucumber
        exNameId.put("CU", 10047); // CUDA
        exNameId.put("CUH", 10047); // CUDA
        exNameId.put("PXD", 10048); // Cython
        exNameId.put("PXI", 10048); // Cython
        exNameId.put("PYX", 10048); // Cython
        exNameId.put("D", 10049); // D
        exNameId.put("DA", 10050); // DAL
        exNameId.put("DART", 10051); // Dart
        exNameId.put("DHALL", 10052); // dhall
        exNameId.put("DT", 10053); // DIET
        exNameId.put("DIFF", 10054); // diff
        exNameId.put("PATCH", 10054); // diff
        exNameId.put("DITA", 10055); // DITA
        exNameId.put("DXL", 10056); // DOORSExtensionLanguage
        exNameId.put("BAT", 10057); // DOSBatch
        exNameId.put("BAT", 10057); // DOSBatch
        exNameId.put("BTM", 10057); // DOSBatch
        exNameId.put("BTM", 10057); // DOSBatch
        exNameId.put("CMD", 10057); // DOSBatch
        exNameId.put("CMD", 10057); // DOSBatch
        exNameId.put("DRL", 10058); // Drools
        exNameId.put("DTD", 10059); // DTD
        exNameId.put("D", 10060); // dtrace
        exNameId.put("ECPP", 10061); // ECPP
        exNameId.put("EEX", 10062); // EEx
        exNameId.put("EJS", 10063); // EJS
        exNameId.put("EX", 10064); // Elixir
        exNameId.put("EXS", 10064); // Elixir
        exNameId.put("ELM", 10065); // Elm
        exNameId.put("ECR", 10066); // EmbeddedCrystal
        exNameId.put("ERB", 10067); // ERB
        exNameId.put("ERB", 10067); // ERB
        exNameId.put("APP.SRC", 10068); // Erlang
        exNameId.put("EMAKEFILE", 10068); // Erlang
        exNameId.put("ERL", 10068); // Erlang
        exNameId.put("HRL", 10068); // Erlang
        exNameId.put("REBAR.CONFIG", 10068); // Erlang
        exNameId.put("REBAR.CONFIG.LOCK", 10068); // Erlang
        exNameId.put("REBAR.LOCK", 10068); // Erlang
        exNameId.put("XRL", 10068); // Erlang
        exNameId.put("YRL", 10068); // Erlang
        exNameId.put("EXP", 10069); // Expect
        exNameId.put("FSI", 10070); // F#
        exNameId.put("FS", 10070); // F#
        exNameId.put("FS", 10070); // F#
        exNameId.put("FSX", 10071); // F#Script
        exNameId.put("FNL", 10072); // Fennel
        exNameId.put("FISH", 10073); // FishShell
        exNameId.put("FOCEXEC", 10074); // Focus
        exNameId.put("4TH", 10075); // Forth
        exNameId.put("E4", 10075); // Forth
        exNameId.put("F83", 10075); // Forth
        exNameId.put("FB", 10075); // Forth
        exNameId.put("FORTH", 10075); // Forth
        exNameId.put("FPM", 10075); // Forth
        exNameId.put("FR", 10075); // Forth
        exNameId.put("FRT", 10075); // Forth
        exNameId.put("FT", 10075); // Forth
        exNameId.put("FTH", 10075); // Forth
        exNameId.put("RX", 10075); // Forth
        exNameId.put("FS", 10075); // Forth
        exNameId.put("F", 10075); // Forth
        exNameId.put("FOR", 10075); // Forth
        exNameId.put("F", 10076); // Fortran77
        exNameId.put("F77", 10076); // Fortran77
        exNameId.put("F77", 10076); // Fortran77
        exNameId.put("FOR", 10076); // Fortran77
        exNameId.put("FTN", 10076); // Fortran77
        exNameId.put("FTN", 10076); // Fortran77
        exNameId.put("PFO", 10076); // Fortran77
        exNameId.put("F", 10076); // Fortran77
        exNameId.put("FOR", 10076); // Fortran77
        exNameId.put("F90", 10077); // Fortran90
        exNameId.put("F90", 10077); // Fortran90
        exNameId.put("F95", 10078); // Fortran95
        exNameId.put("F95", 10078); // Fortran95
        exNameId.put("FTL", 10079); // FreemarkerTemplate
        exNameId.put("FXML", 10080); // FXML
        exNameId.put("GD", 10081); // GDScript
        exNameId.put("MSG", 10082); // GencatNLS
        exNameId.put("GLADE", 10083); // Glade
        exNameId.put("UI", 10083); // Glade
        exNameId.put("COMP", 10084); // GLSL
        exNameId.put("FP", 10084); // GLSL
        exNameId.put("FRAG", 10084); // GLSL
        exNameId.put("FRG", 10084); // GLSL
        exNameId.put("FSH", 10084); // GLSL
        exNameId.put("FSHADER", 10084); // GLSL
        exNameId.put("GEO", 10084); // GLSL
        exNameId.put("GEOM", 10084); // GLSL
        exNameId.put("GLSL", 10084); // GLSL
        exNameId.put("GLSLV", 10084); // GLSL
        exNameId.put("GSHADER", 10084); // GLSL
        exNameId.put("TESC", 10084); // GLSL
        exNameId.put("TESE", 10084); // GLSL
        exNameId.put("VERT", 10084); // GLSL
        exNameId.put("VRX", 10084); // GLSL
        exNameId.put("VSH", 10084); // GLSL
        exNameId.put("VSHADER", 10084); // GLSL
        exNameId.put("GO", 10085); // Go
        exNameId.put("GRADLE", 10086); // Gradle
        exNameId.put("GRADLE.KTS", 10086); // Gradle
        exNameId.put("GSP", 10087); // Grails
        exNameId.put("GQL", 10088); // GraphQL
        exNameId.put("GRAPHQL", 10088); // GraphQL
        exNameId.put("GRAPHQLS", 10088); // GraphQL
        exNameId.put("GANT", 10089); // Groovy
        exNameId.put("GROOVY", 10089); // Groovy
        exNameId.put("GRT", 10089); // Groovy
        exNameId.put("GTPL", 10089); // Groovy
        exNameId.put("GVY", 10089); // Groovy
        exNameId.put("JENKINSFILE", 10089); // Groovy
        exNameId.put("HAML", 10090); // Haml
        exNameId.put("HAML.DEFACE", 10090); // Haml
        exNameId.put("HANDLEBARS", 10091); // Handlebars
        exNameId.put("HBS", 10091); // Handlebars
        exNameId.put("HB", 10092); // Harbour
        exNameId.put("HS", 10093); // Haskell
        exNameId.put("HSC", 10093); // Haskell
        exNameId.put("LHS", 10093); // Haskell
        exNameId.put("HX", 10094); // Haxe
        exNameId.put("HXSL", 10094); // Haxe
        exNameId.put("HCL", 10095); // HCL
        exNameId.put("NOMAD", 10095); // HCL
        exNameId.put("TF", 10095); // HCL
        exNameId.put("TFVARS", 10095); // HCL
        exNameId.put("CG", 10096); // HLSL
        exNameId.put("CGINC", 10096); // HLSL
        exNameId.put("FXH", 10096); // HLSL
        exNameId.put("HLSL", 10096); // HLSL
        exNameId.put("HLSLI", 10096); // HLSL
        exNameId.put("SHADER", 10096); // HLSL
        exNameId.put("HOON", 10097); // Hoon
        exNameId.put("HTM", 10098); // HTML
        exNameId.put("HTML", 10098); // HTML
        exNameId.put("HTML.HL", 10098); // HTML
        exNameId.put("XHT", 10098); // HTML
        exNameId.put("DLM", 10099); // IDL
        exNameId.put("IDL", 10099); // IDL
        exNameId.put("PRO", 10099); // IDL
        exNameId.put("IDR", 10100); // Idris
        exNameId.put("IPF", 10101); // IgorPro
        exNameId.put("IMBA", 10102); // Imba
        exNameId.put("BUILDOZER.SPEC", 10103); // INI
        exNameId.put("INI", 10103); // INI
        exNameId.put("LEKTORPROJECT", 10103); // INI
        exNameId.put("PREFS", 10103); // INI
        exNameId.put("ISM", 10104); // InstallShield
        exNameId.put("IPL", 10105); // IPL
        exNameId.put("JAVA", 10106); // Java
        exNameId.put("_JS", 10107); // JavaScript
        exNameId.put("BONES", 10107); // JavaScript
        exNameId.put("ES6", 10107); // JavaScript
        exNameId.put("JAKE", 10107); // JavaScript
        exNameId.put("JAKEFILE", 10107); // JavaScript
        exNameId.put("JS", 10107); // JavaScript
        exNameId.put("JSB", 10107); // JavaScript
        exNameId.put("JSCAD", 10107); // JavaScript
        exNameId.put("JSFL", 10107); // JavaScript
        exNameId.put("JSM", 10107); // JavaScript
        exNameId.put("JSS", 10107); // JavaScript
        exNameId.put("MJS", 10107); // JavaScript
        exNameId.put("NJS", 10107); // JavaScript
        exNameId.put("PAC", 10107); // JavaScript
        exNameId.put("SJS", 10107); // JavaScript
        exNameId.put("SSJS", 10107); // JavaScript
        exNameId.put("XSJS", 10107); // JavaScript
        exNameId.put("XSJSLIB", 10107); // JavaScript
        exNameId.put("JSF", 10108); // JavaServerFaces
        exNameId.put("JCL", 10109); // JCL
        exNameId.put("ARCCONFIG", 10110); // JSON
        exNameId.put("AVSC", 10110); // JSON
        exNameId.put("COMPOSER.LOCK", 10110); // JSON
        exNameId.put("GEOJSON", 10110); // JSON
        exNameId.put("GLTF", 10110); // JSON
        exNameId.put("HAR", 10110); // JSON
        exNameId.put("HTMLHINTRC", 10110); // JSON
        exNameId.put("JSON", 10110); // JSON
        exNameId.put("JSON-TMLANGUAGE", 10110); // JSON
        exNameId.put("JSONL", 10110); // JSON
        exNameId.put("MCMETA", 10110); // JSON
        exNameId.put("MCMOD.INFO", 10110); // JSON
        exNameId.put("TERN-CONFIG", 10110); // JSON
        exNameId.put("TERN-PROJECT", 10110); // JSON
        exNameId.put("TFSTATE", 10110); // JSON
        exNameId.put("TFSTATE.BACKUP", 10110); // JSON
        exNameId.put("TOPOJSON", 10110); // JSON
        exNameId.put("WATCHMANCONFIG", 10110); // JSON
        exNameId.put("WEBAPP", 10110); // JSON
        exNameId.put("WEBMANIFEST", 10110); // JSON
        exNameId.put("YYP", 10110); // JSON
        exNameId.put("JSON5", 10111); // JSON5
        exNameId.put("JSP", 10112); // JSP
        exNameId.put("JSPF", 10112); // JSP
        exNameId.put("JSX", 10113); // JSX
        exNameId.put("JL", 10114); // Julia
        exNameId.put("IPYNB", 10115); // JupyterNotebook
        exNameId.put("KSC", 10116); // Kermit
        exNameId.put("KSH", 10117); // KornShell
        exNameId.put("KT", 10118); // Kotlin
        exNameId.put("KTM", 10118); // Kotlin
        exNameId.put("KTS", 10118); // Kotlin
        exNameId.put("HLEAN", 10119); // Lean
        exNameId.put("LEAN", 10119); // Lean
        exNameId.put("LESS", 10120); // LESS
        exNameId.put("L", 10121); // lex
        exNameId.put("LEX", 10121); // lex
        exNameId.put("LFE", 10122); // LFE
        exNameId.put("LIQUID", 10123); // liquid
        exNameId.put("ASD", 10124); // Lisp
        exNameId.put("EL", 10124); // Lisp
        exNameId.put("LISP", 10124); // Lisp
        exNameId.put("LSP", 10124); // Lisp
        exNameId.put("CL", 10124); // Lisp
        exNameId.put("JL", 10124); // Lisp
        exNameId.put("LIDR", 10125); // LiterateIdris
        exNameId.put("OSCRIPT", 10126); // LiveLinkOScript
        exNameId.put("LGT", 10127); // Logtalk
        exNameId.put("LOGTALK", 10127); // Logtalk
        exNameId.put("LUA", 10128); // Lua
        exNameId.put("NSE", 10128); // Lua
        exNameId.put("P8", 10128); // Lua
        exNameId.put("PD_LUA", 10128); // Lua
        exNameId.put("RBXS", 10128); // Lua
        exNameId.put("WLUA", 10128); // Lua
        exNameId.put("AC", 10129); // m4
        exNameId.put("M4", 10129); // m4
        exNameId.put("AM", 10130); // make
        exNameId.put("GNUMAKEFILE", 10130); // make
        exNameId.put("GNUMAKEFILE", 10130); // make
        exNameId.put("MAKEFILE", 10130); // make
        exNameId.put("MAKEFILE", 10130); // make
        exNameId.put("MK", 10130); // make
        exNameId.put("MAKO", 10131); // Mako
        exNameId.put("MAO", 10131); // Mako
        exNameId.put("CONTENTS.LR", 10132); // Markdown
        exNameId.put("MARKDOWN", 10132); // Markdown
        exNameId.put("MD", 10132); // Markdown
        exNameId.put("MDOWN", 10132); // Markdown
        exNameId.put("MDWN", 10132); // Markdown
        exNameId.put("MDX", 10132); // Markdown
        exNameId.put("MKD", 10132); // Markdown
        exNameId.put("MKDN", 10132); // Markdown
        exNameId.put("MKDOWN", 10132); // Markdown
        exNameId.put("RONN", 10132); // Markdown
        exNameId.put("WORKBOOK", 10132); // Markdown
        exNameId.put("CDF", 10133); // Mathematica
        exNameId.put("MA", 10133); // Mathematica
        exNameId.put("MATHEMATICA", 10133); // Mathematica
        exNameId.put("MT", 10133); // Mathematica
        exNameId.put("NBP", 10133); // Mathematica
        exNameId.put("WL", 10133); // Mathematica
        exNameId.put("WLT", 10133); // Mathematica
        exNameId.put("M", 10133); // Mathematica
        exNameId.put("M", 10134); // MATLAB
        exNameId.put("POM", 10135); // Maven
        exNameId.put("POM.XML", 10135); // Maven
        exNameId.put("I3", 10136); // Modula3
        exNameId.put("IG", 10136); // Modula3
        exNameId.put("M3", 10136); // Modula3
        exNameId.put("MG", 10136); // Modula3
        exNameId.put("CSPROJ", 10137); // MSBuildscript
        exNameId.put("VBPROJ", 10137); // MSBuildscript
        exNameId.put("VCPROJ", 10137); // MSBuildscript
        exNameId.put("WDPROJ", 10137); // MSBuildscript
        exNameId.put("WIXPROJ", 10137); // MSBuildscript
        exNameId.put("MPS", 10138); // MUMPS
        exNameId.put("M", 10138); // MUMPS
        exNameId.put("MUSTACHE", 10139); // Mustache
        exNameId.put("MXML", 10140); // MXML
        exNameId.put("BUILD", 10141); // NAntscript
        exNameId.put("DMAP", 10142); // NASTRANDMAP
        exNameId.put("N", 10143); // Nemerle
        exNameId.put("NIM", 10144); // Nim
        exNameId.put("NIM.CFG", 10144); // Nim
        exNameId.put("NIMBLE", 10144); // Nim
        exNameId.put("NIMROD", 10144); // Nim
        exNameId.put("NIMS", 10144); // Nim
        exNameId.put("NIX", 10145); // Nix
        exNameId.put("M", 10146); // ObjectiveC
        exNameId.put("MM", 10147); // ObjectiveC++
        exNameId.put("ELIOM", 10148); // OCaml
        exNameId.put("ELIOMI", 10148); // OCaml
        exNameId.put("ML", 10148); // OCaml
        exNameId.put("ML4", 10148); // OCaml
        exNameId.put("MLI", 10148); // OCaml
        exNameId.put("MLL", 10148); // OCaml
        exNameId.put("MLY", 10148); // OCaml
        exNameId.put("CL", 10149); // OpenCL
        exNameId.put("FMT", 10150); // OracleForms
        exNameId.put("BOD", 10151); // OraclePL/SQL
        exNameId.put("FNC", 10151); // OraclePL/SQL
        exNameId.put("PRC", 10151); // OraclePL/SQL
        exNameId.put("SPC", 10151); // OraclePL/SQL
        exNameId.put("TRG", 10151); // OraclePL/SQL
        exNameId.put("REX", 10152); // OracleReports
        exNameId.put("DFM", 10153); // Pascal
        exNameId.put("DPR", 10153); // Pascal
        exNameId.put("LPR", 10153); // Pascal
        exNameId.put("P", 10153); // Pascal
        exNameId.put("PAS", 10153); // Pascal
        exNameId.put("PASCAL", 10153); // Pascal
        exNameId.put("PP", 10154); // Pascal/Puppet
        exNameId.put("PCL", 10155); // PatranCommandLanguage
        exNameId.put("SES", 10155); // PatranCommandLanguage
        exNameId.put("ACK", 10156); // Perl
        exNameId.put("AL", 10156); // Perl
        exNameId.put("CPANFILE", 10156); // Perl
        exNameId.put("MAKEFILE.PL", 10156); // Perl
        exNameId.put("PERL", 10156); // Perl
        exNameId.put("PH", 10156); // Perl
        exNameId.put("PLH", 10156); // Perl
        exNameId.put("PLX", 10156); // Perl
        exNameId.put("PM", 10156); // Perl
        exNameId.put("PSGI", 10156); // Perl
        exNameId.put("REXFILE", 10156); // Perl
        exNameId.put("PL", 10156); // Perl
        exNameId.put("P6", 10156); // Perl
        exNameId.put("AW", 10157); // PHP
        exNameId.put("CTP", 10157); // PHP
        exNameId.put("PHAKEFILE", 10157); // PHP
        exNameId.put("PHP", 10157); // PHP
        exNameId.put("PHP3", 10157); // PHP
        exNameId.put("PHP4", 10157); // PHP
        exNameId.put("PHP5", 10157); // PHP
        exNameId.put("PHP_CS", 10157); // PHP
        exNameId.put("PHP_CS.DIST", 10157); // PHP
        exNameId.put("PHPS", 10157); // PHP
        exNameId.put("PHPT", 10157); // PHP
        exNameId.put("PHTML", 10157); // PHP
        exNameId.put("INC", 10158); // PHP/Pascal
        exNameId.put("PIG", 10159); // PigLatin
        exNameId.put("PL1", 10160); // PL/I
        exNameId.put("LIT", 10161); // PL/M
        exNameId.put("PLM", 10161); // PL/M
        exNameId.put("PO", 10162); // POFile
        exNameId.put("PBT", 10163); // PowerBuilder
        exNameId.put("SRA", 10163); // PowerBuilder
        exNameId.put("SRF", 10163); // PowerBuilder
        exNameId.put("SRM", 10163); // PowerBuilder
        exNameId.put("SRS", 10163); // PowerBuilder
        exNameId.put("SRU", 10163); // PowerBuilder
        exNameId.put("SRW", 10163); // PowerBuilder
        exNameId.put("PS1", 10164); // PowerShell
        exNameId.put("PSD1", 10164); // PowerShell
        exNameId.put("PSM1", 10164); // PowerShell
        exNameId.put("PRO", 10165); // ProGuard
        exNameId.put("P", 10166); // Prolog
        exNameId.put("PROLOG", 10166); // Prolog
        exNameId.put("YAP", 10166); // Prolog
        exNameId.put("PL", 10166); // Prolog
        exNameId.put("P6", 10166); // Prolog
        exNameId.put("PRO", 10166); // Prolog
        exNameId.put("PROTO", 10167); // ProtocolBuffers
        exNameId.put("JADE", 10168); // Pug
        exNameId.put("PUG", 10168); // Pug
        exNameId.put("PURS", 10169); // PureScript
        exNameId.put("BUCK", 10170); // Python
        exNameId.put("BUILD.BAZEL", 10170); // Python
        exNameId.put("GCLIENT", 10170); // Python
        exNameId.put("GYP", 10170); // Python
        exNameId.put("GYPI", 10170); // Python
        exNameId.put("LMI", 10170); // Python
        exNameId.put("PY", 10170); // Python
        exNameId.put("PY3", 10170); // Python
        exNameId.put("PYDE", 10170); // Python
        exNameId.put("PYI", 10170); // Python
        exNameId.put("PYP", 10170); // Python
        exNameId.put("PYT", 10170); // Python
        exNameId.put("PYW", 10170); // Python
        exNameId.put("SCONSCRIPT", 10170); // Python
        exNameId.put("SCONSTRUCT", 10170); // Python
        exNameId.put("SNAKEFILE", 10170); // Python
        exNameId.put("TAC", 10170); // Python
        exNameId.put("WORKSPACE", 10170); // Python
        exNameId.put("WSCRIPT", 10170); // Python
        exNameId.put("WSGI", 10170); // Python
        exNameId.put("XPY", 10170); // Python
        exNameId.put("QBS", 10171); // QML
        exNameId.put("QML", 10171); // QML
        exNameId.put("UI", 10172); // Qt
        exNameId.put("TS", 10173); // QtLinguist
        exNameId.put("PRO", 10174); // QtProject
        exNameId.put("EXPR-DIST", 10175); // R
        exNameId.put("R", 10175); // R
        exNameId.put("R", 10175); // R
        exNameId.put("RD", 10175); // R
        exNameId.put("RPROFILE", 10175); // R
        exNameId.put("RSX", 10175); // R
        exNameId.put("RKT", 10176); // Racket
        exNameId.put("RKTD", 10176); // Racket
        exNameId.put("RKTL", 10176); // Racket
        exNameId.put("SCRBL", 10176); // Racket
        exNameId.put("PM6", 10177); // Raku
        exNameId.put("RAKU", 10177); // Raku
        exNameId.put("RAKUMOD", 10177); // Raku
        exNameId.put("P6", 10178); // Raku/Prolog
        exNameId.put("P6", 10178); // Raku/Prolog
        exNameId.put("RAML", 10179); // RAML
        exNameId.put("PYJ", 10180); // RapydScript
        exNameId.put("CSHTML", 10181); // Razor
        exNameId.put("RAZOR", 10181); // Razor
        exNameId.put("RE", 10182); // ReasonML
        exNameId.put("REI", 10182); // ReasonML
        exNameId.put("REST", 10183); // reStructuredText
        exNameId.put("REST.TXT", 10183); // reStructuredText
        exNameId.put("RST", 10183); // reStructuredText
        exNameId.put("RST.TXT", 10183); // reStructuredText
        exNameId.put("PPRX", 10184); // Rexx
        exNameId.put("REXX", 10184); // Rexx
        exNameId.put("RMD", 10185); // Rmd
        exNameId.put("ROBOT", 10186); // RobotFramework
        exNameId.put("APPRAISALS", 10187); // Ruby
        exNameId.put("BERKSFILE", 10187); // Ruby
        exNameId.put("BREWFILE", 10187); // Ruby
        exNameId.put("BUILDER", 10187); // Ruby
        exNameId.put("BUILDFILE", 10187); // Ruby
        exNameId.put("CAPFILE", 10187); // Ruby
        exNameId.put("DANGERFILE", 10187); // Ruby
        exNameId.put("DELIVERFILE", 10187); // Ruby
        exNameId.put("EYE", 10187); // Ruby
        exNameId.put("FASTFILE", 10187); // Ruby
        exNameId.put("GEMFILE", 10187); // Ruby
        exNameId.put("GEMFILE.LOCK", 10187); // Ruby
        exNameId.put("GEMSPEC", 10187); // Ruby
        exNameId.put("GOD", 10187); // Ruby
        exNameId.put("GUARDFILE", 10187); // Ruby
        exNameId.put("IRBRC", 10187); // Ruby
        exNameId.put("JARFILE", 10187); // Ruby
        exNameId.put("JBUILDER", 10187); // Ruby
        exNameId.put("MAVENFILE", 10187); // Ruby
        exNameId.put("MSPEC", 10187); // Ruby
        exNameId.put("PODFILE", 10187); // Ruby
        exNameId.put("PODSPEC", 10187); // Ruby
        exNameId.put("PRYRC", 10187); // Ruby
        exNameId.put("PUPPETFILE", 10187); // Ruby
        exNameId.put("RABL", 10187); // Ruby
        exNameId.put("RAKE", 10187); // Ruby
        exNameId.put("RB", 10187); // Ruby
        exNameId.put("RBUILD", 10187); // Ruby
        exNameId.put("RBW", 10187); // Ruby
        exNameId.put("RBX", 10187); // Ruby
        exNameId.put("RU", 10187); // Ruby
        exNameId.put("SNAPFILE", 10187); // Ruby
        exNameId.put("THOR", 10187); // Ruby
        exNameId.put("THORFILE", 10187); // Ruby
        exNameId.put("VAGRANTFILE", 10187); // Ruby
        exNameId.put("WATCHR", 10187); // Ruby
        exNameId.put("RHTML", 10188); // RubyHTML
        exNameId.put("RS", 10189); // Rust
        exNameId.put("RS.IN", 10189); // Rust
        exNameId.put("SLS", 10190); // SaltStack
        exNameId.put("SAS", 10191); // SAS
        exNameId.put("SASS", 10192); // Sass
        exNameId.put("SCSS", 10192); // Sass
        exNameId.put("KOJO", 10193); // Scala
        exNameId.put("SBT", 10193); // Scala
        exNameId.put("SCALA", 10193); // Scala
        exNameId.put("SC", 10194); // Scheme
        exNameId.put("SCH", 10194); // Scheme
        exNameId.put("SCM", 10194); // Scheme
        exNameId.put("SLD", 10194); // Scheme
        exNameId.put("SPS", 10194); // Scheme
        exNameId.put("SS", 10194); // Scheme
        exNameId.put("SLS", 10194); // Scheme
        exNameId.put("SED", 10195); // sed
        exNameId.put("IL", 10196); // SKILL
        exNameId.put("ILS", 10197); // SKILL++
        exNameId.put("ICE", 10198); // Slice
        exNameId.put("SLIM", 10199); // Slim
        exNameId.put("ST", 10200); // Smalltalk
        exNameId.put("CS", 10200); // Smalltalk
        exNameId.put("SMARTY", 10201); // Smarty
        exNameId.put("TPL", 10201); // Smarty
        exNameId.put("SBL", 10202); // SoftbridgeBasic
        exNameId.put("SBL", 10202); // SoftbridgeBasic
        exNameId.put("SOL", 10203); // Solidity
        exNameId.put("SP", 10204); // SparForte
        exNameId.put("E", 10205); // Specmane
        exNameId.put("CQL", 10206); // SQL
        exNameId.put("MYSQL", 10206); // SQL
        exNameId.put("PSQL", 10206); // SQL
        exNameId.put("SQL", 10206); // SQL
        exNameId.put("SQL", 10206); // SQL
        exNameId.put("TAB", 10206); // SQL
        exNameId.put("UDF", 10206); // SQL
        exNameId.put("VIW", 10206); // SQL
        exNameId.put("DATA.SQL", 10207); // SQLData
        exNameId.put("SPC.SQL", 10208); // SQLStoredProcedure
        exNameId.put("SPOC.SQL", 10208); // SQLStoredProcedure
        exNameId.put("SPROC.SQL", 10208); // SQLStoredProcedure
        exNameId.put("UDF.SQL", 10208); // SQLStoredProcedure
        exNameId.put("NUT", 10209); // Squirrel
        exNameId.put("FUN", 10210); // StandardML
        exNameId.put("SIG", 10210); // StandardML
        exNameId.put("SML", 10210); // StandardML
        exNameId.put("BZL", 10211); // Starlark
        exNameId.put("ADO", 10212); // Stata
        exNameId.put("DO", 10212); // Stata
        exNameId.put("DO", 10212); // Stata
        exNameId.put("DOH", 10212); // Stata
        exNameId.put("IHLP", 10212); // Stata
        exNameId.put("MATA", 10212); // Stata
        exNameId.put("MATAH", 10212); // Stata
        exNameId.put("STHLP", 10212); // Stata
        exNameId.put("STYL", 10213); // Stylus
        exNameId.put("SSS", 10214); // SugarSS
        exNameId.put("SVELTE", 10215); // Svelte
        exNameId.put("SVG", 10216); // SVG
        exNameId.put("SVG", 10216); // SVG
        exNameId.put("SWIFT", 10217); // Swift
        exNameId.put("I", 10218); // SWIG
        exNameId.put("ITK", 10219); // Tcl/Tk
        exNameId.put("TCL", 10219); // Tcl/Tk
        exNameId.put("TK", 10219); // Tcl/Tk
        exNameId.put("MET", 10220); // Teamcentermet
        exNameId.put("MTH", 10221); // Teamcentermth
        exNameId.put("AUX", 10222); // TeX
        exNameId.put("BBX", 10222); // TeX
        exNameId.put("BIB", 10222); // TeX
        exNameId.put("BST", 10222); // TeX
        exNameId.put("CBX", 10222); // TeX
        exNameId.put("DTX", 10222); // TeX
        exNameId.put("INS", 10222); // TeX
        exNameId.put("LBX", 10222); // TeX
        exNameId.put("LTX", 10222); // TeX
        exNameId.put("MKII", 10222); // TeX
        exNameId.put("MKIV", 10222); // TeX
        exNameId.put("MKVI", 10222); // TeX
        exNameId.put("STY", 10222); // TeX
        exNameId.put("TEX", 10222); // TeX
        exNameId.put("CLS", 10222); // TeX
        exNameId.put("THRIFT", 10223); // Thrift
        exNameId.put("TPD", 10224); // TITAN Project File Information
        exNameId.put("TSS", 10225); // TitaniumStyleSheet
        exNameId.put("CII", 10226); // TNSDL
        exNameId.put("CIN", 10226); // TNSDL
        exNameId.put("IN1", 10226); // TNSDL
        exNameId.put("IN2", 10226); // TNSDL
        exNameId.put("IN3", 10226); // TNSDL
        exNameId.put("IN4", 10226); // TNSDL
        exNameId.put("INF", 10226); // TNSDL
        exNameId.put("INTERFACE", 10226); // TNSDL
        exNameId.put("ROU", 10226); // TNSDL
        exNameId.put("SDL", 10226); // TNSDL
        exNameId.put("SDT", 10226); // TNSDL
        exNameId.put("SPD", 10226); // TNSDL
        exNameId.put("SSC", 10226); // TNSDL
        exNameId.put("SST", 10226); // TNSDL
        exNameId.put("TOML", 10227); // TOML
        exNameId.put("TTCN", 10228); // TTCN
        exNameId.put("TTCN2", 10228); // TTCN
        exNameId.put("TTCN3", 10228); // TTCN
        exNameId.put("TTCNPP", 10228); // TTCN
        exNameId.put("TWIG", 10229); // Twig
        exNameId.put("TSX", 10230); // TypeScript
        exNameId.put("TS", 10230); // TypeScript
        exNameId.put("MAT", 10231); // Unity-Prefab
        exNameId.put("PREFAB", 10231); // Unity-Prefab
        exNameId.put("VALA", 10232); // Vala
        exNameId.put("VAPI", 10233); // ValaHeader
        exNameId.put("VM", 10234); // VelocityTemplateLanguage
        exNameId.put("SV", 10235); // Verilog-SystemVerilog
        exNameId.put("SVH", 10235); // Verilog-SystemVerilog
        exNameId.put("V", 10235); // Verilog-SystemVerilog
        exNameId.put("VHD", 10236); // VHDL
        exNameId.put("VHD", 10236); // VHDL
        exNameId.put("VHDL", 10236); // VHDL
        exNameId.put("VHDL", 10236); // VHDL
        exNameId.put("VHF", 10236); // VHDL
        exNameId.put("VHI", 10236); // VHDL
        exNameId.put("VHO", 10236); // VHDL
        exNameId.put("VHS", 10236); // VHDL
        exNameId.put("VHT", 10236); // VHDL
        exNameId.put("VHW", 10236); // VHDL
        exNameId.put("VIM", 10237); // vimscript
        exNameId.put("BAS", 10238); // VisualBasic
        exNameId.put("CTL", 10238); // VisualBasic
        exNameId.put("DSR", 10238); // VisualBasic
        exNameId.put("FRM", 10238); // VisualBasic
        exNameId.put("FRX", 10238); // VisualBasic
        exNameId.put("VB", 10238); // VisualBasic
        exNameId.put("VB", 10238); // VisualBasic
        exNameId.put("VBA", 10238); // VisualBasic
        exNameId.put("VBA", 10238); // VisualBasic
        exNameId.put("VBHTML", 10238); // VisualBasic
        exNameId.put("VBS", 10238); // VisualBasic
        exNameId.put("VBS", 10238); // VisualBasic
        exNameId.put("CLS", 10238); // VisualBasic
        exNameId.put("SCA", 10239); // VisualFoxPro
        exNameId.put("SCA", 10239); // VisualFoxPro
        exNameId.put("COMPONENT", 10240); // VisualforceComponent
        exNameId.put("PAGE", 10241); // VisualforcePage
        exNameId.put("VUE", 10242); // VuejsComponent
        exNameId.put("WAST", 10243); // WebAssembly
        exNameId.put("WAT", 10243); // WebAssembly
        exNameId.put("MC", 10244); // WindowsMessageFile
        exNameId.put("DEF", 10245); // WindowsModuleDefinition
        exNameId.put("RC", 10246); // WindowsResourceFile
        exNameId.put("RC2", 10246); // WindowsResourceFile
        exNameId.put("WXI", 10247); // WiXinclude
        exNameId.put("WXS", 10248); // WiXsource
        exNameId.put("WXL", 10249); // WiXstringlocalization
        exNameId.put("XAML", 10250); // XAML
        exNameId.put("PRG", 10251); // xBase
        exNameId.put("PRW", 10251); // xBase
        exNameId.put("CH", 10252); // xBaseHeader
        exNameId.put("XHTML", 10253); // XHTML
        exNameId.put("XMI", 10254); // XMI
        exNameId.put("XMI", 10254); // XMI
        exNameId.put("ADML", 10255); // XML
        exNameId.put("ADMX", 10255); // XML
        exNameId.put("ANT", 10255); // XML
        exNameId.put("APP.CONFIG", 10255); // XML
        exNameId.put("AXML", 10255); // XML
        exNameId.put("BUILDS", 10255); // XML
        exNameId.put("CCPROJ", 10255); // XML
        exNameId.put("CCXML", 10255); // XML
        exNameId.put("CLASSPATH", 10255); // XML
        exNameId.put("CLIXML", 10255); // XML
        exNameId.put("CPROJECT", 10255); // XML
        exNameId.put("CSCFG", 10255); // XML
        exNameId.put("CSDEF", 10255); // XML
        exNameId.put("CSL", 10255); // XML
        exNameId.put("CT", 10255); // XML
        exNameId.put("DEPPROJ", 10255); // XML
        exNameId.put("DITAMAP", 10255); // XML
        exNameId.put("DITAVAL", 10255); // XML
        exNameId.put("DLL.CONFIG", 10255); // XML
        exNameId.put("DOTSETTINGS", 10255); // XML
        exNameId.put("FILTERS", 10255); // XML
        exNameId.put("FSPROJ", 10255); // XML
        exNameId.put("GMX", 10255); // XML
        exNameId.put("GRXML", 10255); // XML
        exNameId.put("IML", 10255); // XML
        exNameId.put("IVY", 10255); // XML
        exNameId.put("JELLY", 10255); // XML
        exNameId.put("JSPROJ", 10255); // XML
        exNameId.put("KML", 10255); // XML
        exNameId.put("LAUNCH", 10255); // XML
        exNameId.put("MDPOLICY", 10255); // XML
        exNameId.put("MJML", 10255); // XML
        exNameId.put("NATVIS", 10255); // XML
        exNameId.put("NDPROJ", 10255); // XML
        exNameId.put("NPROJ", 10255); // XML
        exNameId.put("NUGET.CONFIG", 10255); // XML
        exNameId.put("NUSPEC", 10255); // XML
        exNameId.put("ODD", 10255); // XML
        exNameId.put("OSM", 10255); // XML
        exNameId.put("PACKAGES.CONFIG", 10255); // XML
        exNameId.put("PKGPROJ", 10255); // XML
        exNameId.put("PLIST", 10255); // XML
        exNameId.put("PROJ", 10255); // XML
        exNameId.put("PROJECT", 10255); // XML
        exNameId.put("PROPS", 10255); // XML
        exNameId.put("PS1XML", 10255); // XML
        exNameId.put("PSC1", 10255); // XML
        exNameId.put("PT", 10255); // XML
        exNameId.put("RDF", 10255); // XML
        exNameId.put("RESX", 10255); // XML
        exNameId.put("RSS", 10255); // XML
        exNameId.put("SCXML", 10255); // XML
        exNameId.put("SETTINGS.STYLECOP", 10255); // XML
        exNameId.put("SFPROJ", 10255); // XML
        exNameId.put("SHPROJ", 10255); // XML
        exNameId.put("SRDF", 10255); // XML
        exNameId.put("STORYBOARD", 10255); // XML
        exNameId.put("STTHEME", 10255); // XML
        exNameId.put("SUBLIME-SNIPPET", 10255); // XML
        exNameId.put("TARGETS", 10255); // XML
        exNameId.put("TMCOMMAND", 10255); // XML
        exNameId.put("TML", 10255); // XML
        exNameId.put("TMLANGUAGE", 10255); // XML
        exNameId.put("TMPREFERENCES", 10255); // XML
        exNameId.put("TMSNIPPET", 10255); // XML
        exNameId.put("TMTHEME", 10255); // XML
        exNameId.put("URDF", 10255); // XML
        exNameId.put("UX", 10255); // XML
        exNameId.put("VCXPROJ", 10255); // XML
        exNameId.put("VSIXMANIFEST", 10255); // XML
        exNameId.put("VSSETTINGS", 10255); // XML
        exNameId.put("VSTEMPLATE", 10255); // XML
        exNameId.put("VXML", 10255); // XML
        exNameId.put("WEB.CONFIG", 10255); // XML
        exNameId.put("WEB.DEBUG.CONFIG", 10255); // XML
        exNameId.put("WEB.RELEASE.CONFIG", 10255); // XML
        exNameId.put("WSF", 10255); // XML
        exNameId.put("X3D", 10255); // XML
        exNameId.put("XACRO", 10255); // XML
        exNameId.put("XIB", 10255); // XML
        exNameId.put("XLF", 10255); // XML
        exNameId.put("XLIFF", 10255); // XML
        exNameId.put("XML", 10255); // XML
        exNameId.put("XML", 10255); // XML
        exNameId.put("XML.DIST", 10255); // XML
        exNameId.put("XPROJ", 10255); // XML
        exNameId.put("XSPEC", 10255); // XML
        exNameId.put("XUL", 10255); // XML
        exNameId.put("ZCML", 10255); // XML
        exNameId.put("XQ", 10256); // XQuery
        exNameId.put("XQL", 10256); // XQuery
        exNameId.put("XQM", 10256); // XQuery
        exNameId.put("XQUERY", 10256); // XQuery
        exNameId.put("XQY", 10256); // XQuery
        exNameId.put("XSD", 10257); // XSD
        exNameId.put("XSD", 10257); // XSD
        exNameId.put("XSL", 10258); // XSLT
        exNameId.put("XSL", 10258); // XSLT
        exNameId.put("XSLT", 10258); // XSLT
        exNameId.put("XSLT", 10258); // XSLT
        exNameId.put("XTEND", 10259); // Xtend
        exNameId.put("Y", 10260); // yacc
        exNameId.put("YACC", 10260); // yacc
        exNameId.put("CLANG-FORMAT", 10261); // YAML
        exNameId.put("CLANG-TIDY", 10261); // YAML
        exNameId.put("GEMRC", 10261); // YAML
        exNameId.put("GLIDE.LOCK", 10261); // YAML
        exNameId.put("MIR", 10261); // YAML
        exNameId.put("REEK", 10261); // YAML
        exNameId.put("RVIZ", 10261); // YAML
        exNameId.put("SUBLIME-SYNTAX", 10261); // YAML
        exNameId.put("SYNTAX", 10261); // YAML
        exNameId.put("YAML", 10261); // YAML
        exNameId.put("YAML-TMLANGUAGE", 10261); // YAML
        exNameId.put("YML", 10261); // YAML
        exNameId.put("YML.MYSQL", 10261); // YAML
        exNameId.put("ZSH", 10262); // zsh


        exNameId.put("PROPERTIES" , 10263);

        // 
        exNameId.put("CLASS", 20001);
        exNameId.put("JAR"  , 20002);
        exNameId.put("ZIP"  , 20003);
    }
    public static int getExtensionNameId(String extensionName) {
        Integer res = exNameId.get(extensionName);
        if (res == null) {
            System.out.println("WARNING!!!" + extensionName);
            System.out.println();
            return -1;
        }
        return res.intValue();
    }
    private static HashMap<Integer, String> exIdName = new HashMap<Integer, String>();
    static {
        exIdName.put(10000, "TEXT");
        
        exIdName.put(10001, "ABAP");
        exIdName.put(10002, "ActionScript");
        exIdName.put(10003, "Ada");
        exIdName.put(10004, "ADSO/IDSM");
        exIdName.put(10005, "Agda");
        exIdName.put(10006, "AMPLE");
        exIdName.put(10007, "Ant");
        exIdName.put(10008, "ANTLRGrammar");
        exIdName.put(10009, "ApexClass");
        exIdName.put(10010, "ApexTrigger");
        exIdName.put(10011, "APL");
        exIdName.put(10012, "ArduinoSketch");
        exIdName.put(10013, "AsciiDoc");
        exIdName.put(10014, "ASP");
        exIdName.put(10015, "ASP.NET");
        exIdName.put(10016, "AspectJ");
        exIdName.put(10017, "Assembly");
        exIdName.put(10018, "AutoHotkey");
        exIdName.put(10019, "awk");
        exIdName.put(10020, "Bazel");
        exIdName.put(10021, "Blade");
        exIdName.put(10022, "BourneAgainShell");
        exIdName.put(10023, "BourneShell");
        exIdName.put(10024, "BrightScript");
        exIdName.put(10025, "builder");
        exIdName.put(10026, "C");
        exIdName.put(10027, "CShell");
        exIdName.put(10028, "C#");
        exIdName.put(10029, "C++");
        exIdName.put(10030, "C/C++Header");
        exIdName.put(10031, "CCS");
        exIdName.put(10032, "Chapel");
        exIdName.put(10033, "Clean");
        exIdName.put(10034, "Clojure");
        exIdName.put(10035, "ClojureC");
        exIdName.put(10036, "ClojureScript");
        exIdName.put(10037, "CMake");
        exIdName.put(10038, "COBOL");
        exIdName.put(10039, "CoffeeScript");
        exIdName.put(10040, "ColdFusion");
        exIdName.put(10041, "ColdFusionCFScript");
        exIdName.put(10042, "Coq");
        exIdName.put(10043, "Crystal");
        exIdName.put(10044, "CSON");
        exIdName.put(10045, "CSS");
        exIdName.put(10046, "Cucumber");
        exIdName.put(10047, "CUDA");
        exIdName.put(10048, "Cython");
        exIdName.put(10049, "D");
        exIdName.put(10050, "DAL");
        exIdName.put(10051, "Dart");
        exIdName.put(10052, "dhall");
        exIdName.put(10053, "DIET");
        exIdName.put(10054, "diff");
        exIdName.put(10055, "DITA");
        exIdName.put(10056, "DOORSExtensionLanguage");
        exIdName.put(10057, "DOSBatch");
        exIdName.put(10058, "Drools");
        exIdName.put(10059, "DTD");
        exIdName.put(10060, "dtrace");
        exIdName.put(10061, "ECPP");
        exIdName.put(10062, "EEx");
        exIdName.put(10063, "EJS");
        exIdName.put(10064, "Elixir");
        exIdName.put(10065, "Elm");
        exIdName.put(10066, "EmbeddedCrystal");
        exIdName.put(10067, "ERB");
        exIdName.put(10068, "Erlang");
        exIdName.put(10069, "Expect");
        exIdName.put(10070, "F#");
        exIdName.put(10071, "F#Script");
        exIdName.put(10072, "Fennel");
        exIdName.put(10073, "FishShell");
        exIdName.put(10074, "Focus");
        exIdName.put(10075, "Forth");
        exIdName.put(10076, "Fortran77");
        exIdName.put(10077, "Fortran90");
        exIdName.put(10078, "Fortran95");
        exIdName.put(10079, "FreemarkerTemplate");
        exIdName.put(10080, "FXML");
        exIdName.put(10081, "GDScript");
        exIdName.put(10082, "GencatNLS");
        exIdName.put(10083, "Glade");
        exIdName.put(10084, "GLSL");
        exIdName.put(10085, "Go");
        exIdName.put(10086, "Gradle");
        exIdName.put(10087, "Grails");
        exIdName.put(10088, "GraphQL");
        exIdName.put(10089, "Groovy");
        exIdName.put(10090, "Haml");
        exIdName.put(10091, "Handlebars");
        exIdName.put(10092, "Harbour");
        exIdName.put(10093, "Haskell");
        exIdName.put(10094, "Haxe");
        exIdName.put(10095, "HCL");
        exIdName.put(10096, "HLSL");
        exIdName.put(10097, "Hoon");
        exIdName.put(10098, "HTML");
        exIdName.put(10099, "IDL");
        exIdName.put(10100, "Idris");
        exIdName.put(10101, "IgorPro");
        exIdName.put(10102, "Imba");
        exIdName.put(10103, "INI");
        exIdName.put(10104, "InstallShield");
        exIdName.put(10105, "IPL");
        exIdName.put(10106, "Java");
        exIdName.put(10107, "JavaScript");
        exIdName.put(10108, "JavaServerFaces");
        exIdName.put(10109, "JCL");
        exIdName.put(10110, "JSON");
        exIdName.put(10111, "JSON5");
        exIdName.put(10112, "JSP");
        exIdName.put(10113, "JSX");
        exIdName.put(10114, "Julia");
        exIdName.put(10115, "JupyterNotebook");
        exIdName.put(10116, "Kermit");
        exIdName.put(10117, "KornShell");
        exIdName.put(10118, "Kotlin");
        exIdName.put(10119, "Lean");
        exIdName.put(10120, "LESS");
        exIdName.put(10121, "lex");
        exIdName.put(10122, "LFE");
        exIdName.put(10123, "liquid");
        exIdName.put(10124, "Lisp");
        exIdName.put(10125, "LiterateIdris");
        exIdName.put(10126, "LiveLinkOScript");
        exIdName.put(10127, "Logtalk");
        exIdName.put(10128, "Lua");
        exIdName.put(10129, "m4");
        exIdName.put(10130, "make");
        exIdName.put(10131, "Mako");
        exIdName.put(10132, "Markdown");
        exIdName.put(10133, "Mathematica");
        exIdName.put(10134, "MATLAB");
        exIdName.put(10135, "Maven");
        exIdName.put(10136, "Modula3");
        exIdName.put(10137, "MSBuildscript");
        exIdName.put(10138, "MUMPS");
        exIdName.put(10139, "Mustache");
        exIdName.put(10140, "MXML");
        exIdName.put(10141, "NAntscript");
        exIdName.put(10142, "NASTRANDMAP");
        exIdName.put(10143, "Nemerle");
        exIdName.put(10144, "Nim");
        exIdName.put(10145, "Nix");
        exIdName.put(10146, "ObjectiveC");
        exIdName.put(10147, "ObjectiveC++");
        exIdName.put(10148, "OCaml");
        exIdName.put(10149, "OpenCL");
        exIdName.put(10150, "OracleForms");
        exIdName.put(10151, "OraclePL/SQL");
        exIdName.put(10152, "OracleReports");
        exIdName.put(10153, "Pascal");
        exIdName.put(10154, "Pascal/Puppet");
        exIdName.put(10155, "PatranCommandLanguage");
        exIdName.put(10156, "Perl");
        exIdName.put(10157, "PHP");
        exIdName.put(10158, "PHP/Pascal");
        exIdName.put(10159, "PigLatin");
        exIdName.put(10160, "PL/I");
        exIdName.put(10161, "PL/M");
        exIdName.put(10162, "POFile");
        exIdName.put(10163, "PowerBuilder");
        exIdName.put(10164, "PowerShell");
        exIdName.put(10165, "ProGuard");
        exIdName.put(10166, "Prolog");
        exIdName.put(10167, "ProtocolBuffers");
        exIdName.put(10168, "Pug");
        exIdName.put(10169, "PureScript");
        exIdName.put(10170, "Python");
        exIdName.put(10171, "QML");
        exIdName.put(10172, "Qt");
        exIdName.put(10173, "QtLinguist");
        exIdName.put(10174, "QtProject");
        exIdName.put(10175, "R");
        exIdName.put(10176, "Racket");
        exIdName.put(10177, "Raku");
        exIdName.put(10178, "Raku/Prolog");
        exIdName.put(10179, "RAML");
        exIdName.put(10180, "RapydScript");
        exIdName.put(10181, "Razor");
        exIdName.put(10182, "ReasonML");
        exIdName.put(10183, "reStructuredText");
        exIdName.put(10184, "Rexx");
        exIdName.put(10185, "Rmd");
        exIdName.put(10186, "RobotFramework");
        exIdName.put(10187, "Ruby");
        exIdName.put(10188, "RubyHTML");
        exIdName.put(10189, "Rust");
        exIdName.put(10190, "SaltStack");
        exIdName.put(10191, "SAS");
        exIdName.put(10192, "Sass");
        exIdName.put(10193, "Scala");
        exIdName.put(10194, "Scheme");
        exIdName.put(10195, "sed");
        exIdName.put(10196, "SKILL");
        exIdName.put(10197, "SKILL++");
        exIdName.put(10198, "Slice");
        exIdName.put(10199, "Slim");
        exIdName.put(10200, "Smalltalk");
        exIdName.put(10201, "Smarty");
        exIdName.put(10202, "SoftbridgeBasic");
        exIdName.put(10203, "Solidity");
        exIdName.put(10204, "SparForte");
        exIdName.put(10205, "Specmane");
        exIdName.put(10206, "SQL");
        exIdName.put(10207, "SQLData");
        exIdName.put(10208, "SQLStoredProcedure");
        exIdName.put(10209, "Squirrel");
        exIdName.put(10210, "StandardML");
        exIdName.put(10211, "Starlark");
        exIdName.put(10212, "Stata");
        exIdName.put(10213, "Stylus");
        exIdName.put(10214, "SugarSS");
        exIdName.put(10215, "Svelte");
        exIdName.put(10216, "SVG");
        exIdName.put(10217, "Swift");
        exIdName.put(10218, "SWIG");
        exIdName.put(10219, "Tcl/Tk");
        exIdName.put(10220, "Teamcentermet");
        exIdName.put(10221, "Teamcentermth");
        exIdName.put(10222, "TeX");
        exIdName.put(10223, "Thrift");
        exIdName.put(10224, "TITAN Project File Information");
        exIdName.put(10225, "TitaniumStyleSheet");
        exIdName.put(10226, "TNSDL");
        exIdName.put(10227, "TOML");
        exIdName.put(10228, "TTCN");
        exIdName.put(10229, "Twig");
        exIdName.put(10230, "TypeScript");
        exIdName.put(10231, "Unity-Prefab");
        exIdName.put(10232, "Vala");
        exIdName.put(10233, "ValaHeader");
        exIdName.put(10234, "VelocityTemplateLanguage");
        exIdName.put(10235, "Verilog-SystemVerilog");
        exIdName.put(10236, "VHDL");
        exIdName.put(10237, "vimscript");
        exIdName.put(10238, "VisualBasic");
        exIdName.put(10239, "VisualFoxPro");
        exIdName.put(10240, "VisualforceComponent");
        exIdName.put(10241, "VisualforcePage");
        exIdName.put(10242, "VuejsComponent");
        exIdName.put(10243, "WebAssembly");
        exIdName.put(10244, "WindowsMessageFile");
        exIdName.put(10245, "WindowsModuleDefinition");
        exIdName.put(10246, "WindowsResourceFile");
        exIdName.put(10247, "WiXinclude");
        exIdName.put(10248, "WiXsource");
        exIdName.put(10249, "WiXstringlocalization");
        exIdName.put(10250, "XAML");
        exIdName.put(10251, "xBase");
        exIdName.put(10252, "xBaseHeader");
        exIdName.put(10253, "XHTML");
        exIdName.put(10254, "XMI");
        exIdName.put(10255, "XML");
        exIdName.put(10256, "XQuery");
        exIdName.put(10257, "XSD");
        exIdName.put(10258, "XSLT");
        exIdName.put(10259, "Xtend");
        exIdName.put(10260, "yacc");
        exIdName.put(10261, "YAML");
        exIdName.put(10262, "zsh");
        
        exIdName.put(10263, "PROPERTIES");
        
        exIdName.put(20000, "Binary");
        exIdName.put(20001, "CLASS");
        exIdName.put(20002, "JAR");
        exIdName.put(20003, "ZIP");

    }
    public static String getLanguageName(int id) {
        String res = exIdName.get(id);
        if (res == null) {
            System.out.println("WARNING!!!" + id);
            System.out.println();
            return "";
        }
        return res;
    }
    public static void showUsage() {
        
    }
}
