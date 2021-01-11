package com.company.EX2;

public class BadPupil extends Pupil{
    @Override
    void study() {
        System.out.println("bad study");
    }

    @Override
    void read() {
        System.out.println("bad read");
    }

    @Override
    void write() {
        System.out.println("bad write");
    }

    @Override
    void relax() {
        System.out.println("excelent relax");
    }
}
