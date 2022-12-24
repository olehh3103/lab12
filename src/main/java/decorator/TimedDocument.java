package decorator;

import lombok.Getter;

public class TimedDocument implements Document{
    public Document document;
    @Getter
    public String gcsPath;
    public TimedDocument(Document document) {
        this.document = document;
        this.gcsPath = ((SmartDocument) document).gcsPath;
    }

    @Override
    public String parse() {
        long start = System.currentTimeMillis();
        String docResult = document.parse();
        long finish = System.currentTimeMillis();
        return docResult + " parse time: " + (finish-start) + " ms";
    }
}
