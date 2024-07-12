package assignment.design.patterns.structural;


class CPU {
    public void freeze() {
        System.out.println("CPU: Freeze");
    }

    public void jump(long position) {
        System.out.println("CPU: Jump to " + position);
    }

    public void execute() {
        System.out.println("CPU: Execute");
    }
}

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory: Load data to position " + position);
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive: Read data from LBA " + lba + " with size " + size);
        return new byte[size];
    }
}

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
