package com.example.ejercicio2_3.Operacion;

public class Transacciones {
    public static final String NameDatabase = "ejercicio3";

    public static String tbFotos = "fotos";

    public static final String id = "id";
    public static final String descripcion = "descripcion";
    public static final String foto = "foto";

    public static final String CreateTableFotos = "CREATE TABLE " + tbFotos +
            "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+"descripcion TEXT,foto BLOB)";

    public static final String DropTableFotos = "DROP TABLE " + tbFotos;
}
