package assignment.design.patterns.creational;

interface Document {
    void create();
}

class Resume implements Document {
    @Override
    public void create() {
        System.out.println("Creating Resume document");
    }
}

class Report implements Document {
    @Override
    public void create() {
        System.out.println("Creating Report document");
    }
}

interface DocumentFactory {
    Document createDocument();
}

class ResumeFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new Resume();
    }
}

class ReportFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new Report();
    }
}

class FactoryMethod {
    public static void main(String[] args) {
        DocumentFactory resumeFactory = new ResumeFactory();
        Document resume = resumeFactory.createDocument();
        resume.create();

        DocumentFactory reportFactory = new ReportFactory();
        Document report = reportFactory.createDocument();
        report.create();
    }
}
