package com.bawi.xml.xsd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
    public static void main(String[] args) {
        Matcher m = null;
/*        String text =
                "<message>" +
                "    <header id=\"ab12\" tid=\"cd34\"/>" +
                "    <header tid=\"cde345\" id=\"abc123\"/>" +
                "    <header tid=\"cde345\" id=\"abc123\">my header text</header>" +
                "    <body id=\"ef56\" mid=\"gh78\"/>" +
                "</message>";

        System.out.println("Pattern: id=");
        m = Pattern.compile("id=").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println("Pattern: \\sid=");
        m = Pattern.compile("\\s+id=").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println("Pattern: id=\"\\w+\"");
        m = Pattern.compile("id=\"\\w+\"").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println("Pattern: \\s+\\w*id=\"\\w+\"");
        m = Pattern.compile("\\s+\\w*id=\"\\w+\"").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println("Pattern: \\s+\\w+id=\"\\w+\"");
        m = Pattern.compile("\\s+\\w+id=\"\\w+\"").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println("Pattern: \\s+id=\"(\\w+)\"  and group(1)");
        m = Pattern.compile("\\s+id=\"(\\w+)\"").matcher(text);
        while (m.find()) {
            System.out.println(m.group(1));
        }

        System.out.println("Pattern: \\s+\\w+id=\"(\\w+)\"  and group(1)");
        m = Pattern.compile("\\s+\\w+id=\"(\\w+)\"").matcher(text);
        while (m.find()) {
            System.out.println(m.group(1));
        }

        System.out.println("Pattern: \\s+\\w*id=\"(\\w+)\"  and group(1)");
        m = Pattern.compile("\\s+\\w*id=\"(\\w+)\"").matcher(text);
        while (m.find()) {
            System.out.println(m.group(1));
        }

        System.out.println("Pattern: <header.*(id=\"\\w+\")  and group(1)");
        m = Pattern.compile("<header.*?(/>|</header>)").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }

        Pattern p = Pattern.compile("xyz\\.txt(\\.zip|\\.gz)?");
        System.out.println(p.matcher("xyz.txt").matches());
        System.out.println(p.matcher("xyz.txt.gz").matches());
        System.out.println(p.matcher("xyz.txt.zip").matches());

        System.out.println("Pattern: A*");
        m = Pattern.compile("A*").matcher("AAA"); // A{0,}
        while (m.find()) {
            System.out.println(m.group() + "=" + m.start() + ":" + m.end());
        }

        System.out.println("Pattern: A+");
        m = Pattern.compile("A+").matcher("AAA"); // A{1,}
        while (m.find()) {
            System.out.println(m.group() + "=" + m.start() + ":" + m.end());
        }

        System.out.println("Pattern: A?");
        m = Pattern.compile("A?").matcher("AAA"); // A{0,1}
        while (m.find()) {
            System.out.println(m.group() + "=" + m.start() + ":" + m.end());
        }


        System.out.println("Pattern: A* for ABAABAAAC");
        m = Pattern.compile("A*").matcher("ABAABAAAC"); // A{0,1}
        while (m.find()) {
            System.out.println(m.group() + "=" + m.start() + ":" + m.end());
        }

        System.out.println("Pattern: A+ for ABAABAAAC");
        m = Pattern.compile("A+").matcher("ABAABAAAC"); // A{0,1}
        while (m.find()) {
            System.out.println(m.group() + "=" + m.start() + ":" + m.end());
        }

        System.out.println("Pattern: A? for ABAABAAAC");
        m = Pattern.compile("A?").matcher("ABAABAAAC"); // A{0,1}
        while (m.find()) {
//            System.out.println(m.group());
            System.out.println(m.group() + "=" + m.start() + ":" + m.end());
        }

        String regex = "id\\s*=\\s*(\"[^\"]*\"|'[^']*')";

        System.out.println("Pattern: A? for <xml id=\"123\" />");
        m = Pattern.compile(regex).matcher("<xml id=\"123\" />");
        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println("Pattern: A? for <xml id = '123 456' />");
        m = Pattern.compile(regex).matcher("<xml id = '123 456' />");
        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println("Pattern: A? for: xyz ab+1:2'cd+3:4'ef+5:6'");
        m = Pattern.compile("\\w+\\+[^']*'").matcher("xyz ab+1:2'cd+3:4'ef+5:6'");
        while (m.find()) {
            System.out.println(m.group());
        }*/

        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" +
                "<MyRootElement xmlns=\"http://bawi.com/my-schema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
                "               xsi:schemaLocation=\"http://www.bawi.com/my-schema my-schema.xsd\"" +
                "               xmlns:imp=\"http://bawi.com/my-imported-schema\">" +
                "" +
                "    <MyStringElement>Text</MyStringElement>" +
                "    <MyDuplicatedElement myStringAttribute=\"aaa\">AAA</MyDuplicatedElement>" +
                "" +
                "    <MyDuplicatedElementWithImportedType myImportedIntAttribute=\"abc\">ABC</MyDuplicatedElementWithImportedType>" +
                "" +
                "    <imp:MyDuplicatedElement myImportedIntAttribute=\"222\">BBB</imp:MyDuplicatedElement>" +
                "    <MyDuplicatedElement xmlns=\"http://bawi.com/my-imported-schema\" myImportedIntAttribute=\"333\">CCC</MyDuplicatedElement>" +
                "    <i:MyDuplicatedElement xmlns:i=\"http://bawi.com/my-imported-schema\" myImportedIntAttribute=\"444\">DDD</i:MyDuplicatedElement>" +
                "" +
                "    <MyElementWithIncludedType myIncludedIntAttribute=\"555\">EEE</MyElementWithIncludedType>" +
                "</MyRootElement>";


System.out.println("All MyDuplicatedElement elements including namespaces");
m = Pattern.compile("<(\\w+:)?\\bMyDuplicatedElement\\b.*\\bMyDuplicatedElement>").matcher(xml);
while (m.find()) {
    System.out.println("found: " + m.group());
}


System.out.println("Attributes for MyDuplicatedElement (attribute value without :)");
m = Pattern.compile("<(\\w+:)?\\bMyDuplicatedElement\\b.*?(\\w+=\"[^:\"]*\").*?\\bMyDuplicatedElement>").matcher(xml);
while (m.find()) {
    System.out.println("found: " + m.group(2));
}

System.out.println("Attributes for MyDuplicatedElement (negative lookahead)");
m = Pattern.compile("<(\\w+:)?\\bMyDuplicatedElement\\b.*?(\\s+((?!xmlns)[\\w]+=\"[^\"]*\")).*?\\bMyDuplicatedElement>").matcher(xml);
while (m.find()) {
    System.out.println("found: " + m.group(3));
}


System.out.println("Values of attributes for MyDuplicatedElement");
m = Pattern.compile("<(\\w+:)?MyDuplicatedElement.*?(\\w+=\"([^:\"]*)\").*?MyDuplicatedElement>").matcher(xml);
while (m.find()) {
    System.out.println("found: " + m.group(3));
}

System.out.println("Attributes with name containing Attribute");
m = Pattern.compile("\\w+Attribute=\"[^\"]*\"").matcher(xml);
while (m.find()) {
    System.out.println(m.group());
}



//        String rr = "\\s+((?!xmlns)[\\w]+=\"[^\"]*\")";
        String rr = "(\\b(?!xmlns|:)\\w+\\b)=\"[^\"]*\"";

        System.out.println("Pattern: <header.*(id=\"\\w+\") and group(1)");
        m = Pattern.compile(rr).matcher(" xmlns=\"123\" xmlns:i=\"123\"  abc=\"456\"");
        while (m.find()) {
            System.out.println("h=" + m.group());
        }

//        String r = "((?!src=).)*src=";
//
//        System.out.println("Pattern: <header.*(id=\"\\w+\") and group(1)");
//        m = Pattern.compile(r).matcher("<img border=1 src=image.jpg />");
//        while (m.find()) {
//            System.out.println("h=" + m.group());
//        }
    }
}
