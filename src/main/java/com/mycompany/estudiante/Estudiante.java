package com.mycompany.estudiante;

public class Estudiante implements Datable, comparable<Estudiante> {

    int semestre;
    int creditos;
    int creditosCruzados;

    public Estudiante() {
        this.semestre = 8;
        this.creditos = 30;
        this.creditosCruzados = 20;

    }

    public Estudiante(int semestre, int creditos, int creditosCruzados) {
        this.semestre = semestre;
        this.creditos = creditos;
        this.creditosCruzados = creditosCruzados;
    }

    @Override
    public int semestre() {
        return semestre;
    }

    @Override
    public int creditos() {
        return creditos;
    }

    @Override
    public int creditosCruzados() {
        return creditosCruzados;
    }

    @Override
    public String toString() {
        return "semestre=" + semestre + ", creditos=" + creditos + ", creditosCruzados=" + creditosCruzados;
    }

    @Override
    public int comareTo(Estudiante o) {

        if (semestre < o.semestre) {
            return -1;
        }
        if (semestre > o.semestre) {
            return 1;
        }
        if (creditos < o.creditos) {
            return -1;
        }
        if (creditos > o.creditos) {
            return 1;
        }
        if (creditosCruzados < o.creditosCruzados) {
            return -1;
        }
        if (creditosCruzados > o.creditosCruzados) {
            return 1;
        }

        return 0;//son iguales
    }

    public boolean equals(Estudiante x) {
        if (this == x) {
            return true;
        }
        if (x == null) {
            return false;
        }
        if (this.getClass() != x.getClass()) {
            return false;
        }
        Estudiante that = (Estudiante) x;
        if (this.semestre != that.semestre) {
            return false;
        }
        if (this.creditos != that.creditos) {
            return false;
        }
        if (this.creditosCruzados != that.creditosCruzados) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Estudiante f1 = new Estudiante(8, 30, 20);
        Estudiante f2 = new Estudiante(8, 30, 20);
        System.out.println("La comparación de (" + f2.toString() + ") con (" + f1.toString() + ") es = " + f2.comareTo(f1));
        System.out.println("(" + f1.toString() + ")" + " Es igual con (" + f2.toString() + ") es =" + f1.equals(f2));

    }

}
