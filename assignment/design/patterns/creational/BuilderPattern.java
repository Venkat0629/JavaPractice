package assignment.design.patterns.creational;

class House {
    public String foundation;
    public String structure;
    public String roof;
    public String interior;

    public House(String foundation, String structure, String roof, String interior) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House:\n" + "Foundation: " + foundation + "\n" + "Structure: " + structure + "\n" + "Roof: " + roof + "\n" + "Interior: " + interior;
    }
}

interface HouseBuilder {
    void buildFoundation();

    void buildStructure();

    void buildRoof();

    void buildInterior();

    House build();
}

class SimpleHouseBuilder implements HouseBuilder {
    private House house;

    public SimpleHouseBuilder() {
        this.house = new House("Basic", "Wood", "Shingle", "Simple");
    }

    @Override
    public void buildFoundation() {
        house = new House("Basic", house.structure, house.roof, house.interior);
    }

    @Override
    public void buildStructure() {
        house = new House(house.foundation, "Wood", house.roof, house.interior);
    }

    @Override
    public void buildRoof() {
        house = new House(house.foundation, house.structure, "Shingle", house.interior);
    }

    @Override
    public void buildInterior() {
        house = new House(house.foundation, house.structure, house.roof, "Simple");
    }

    @Override
    public House build() {
        return house;
    }
}

class CivilEngineer {
    private HouseBuilder builder;

    public CivilEngineer(HouseBuilder builder) {
        this.builder = builder;
    }

    public House construct() {
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildRoof();
        builder.buildInterior();
        return builder.build();
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        HouseBuilder builder = new SimpleHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(builder);

        House house = engineer.construct();
        System.out.println(house);
    }
}
