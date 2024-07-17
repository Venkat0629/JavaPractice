package assignment.design.patterns.creational;

/*
Factory Method Pattern: Defines an interface for creating objects,
but allows subclasses to decide which class to instantiate.
 */
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

/*
Example: Consider an abstract Document class with concrete subclasses like Resume and Report.
A DocumentFactory interface defines a method createDocument() which each subclass (ResumeFactory, ReportFactory) implements to instantiate the appropriate
Document subclass based on the client's needs.
 */
