package com.company.EX2;

public class ClassRoom {
    Pupil p1;
    Pupil p2;
    Pupil p3;
    Pupil p4;
    public ClassRoom(Pupil p1, Pupil p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = new Pupil();
        this.p4 = new Pupil();
    }

    public ClassRoom(Pupil p1, Pupil p2, Pupil p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = new Pupil();
    }

    public ClassRoom(Pupil p1, Pupil p2, Pupil p3, Pupil p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom(new BadPupil(), new ExcelentPupil(), new GoodPupil(), new ExcelentPupil());
        cr.p1.read();
        cr.p1.write();
        cr.p1.study();
        cr.p1.relax();

        cr.p2.read();
        cr.p2.write();
        cr.p2.study();
        cr.p2.relax();

        cr.p3.read();
        cr.p3.write();
        cr.p3.study();
        cr.p3.relax();

        cr.p4.read();
        cr.p4.write();
        cr.p4.study();
        cr.p4.relax();

    }
}
