package decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://lab12bucket1123/завантаження.png");
        document = new TimedDocument(document);
//        document = CashedDocument(document);
        System.out.println(document.parse());
    }
}
