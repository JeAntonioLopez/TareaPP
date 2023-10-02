package org.example.java;

public class Cliente {
    private String RUT;
    private String nombre;
    private String direccion;
    private String celular;
    private String email;

    private Cliente(ClienteBuilder builder) {
        this.RUT = builder.RUT;
        this.nombre = builder.nombre;
        this.direccion = builder.direccion;
        this.celular = builder.celular;
        this.email = builder.email;
    }

    public String getRUT() {
        return RUT;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public static class ClienteBuilder {
        private String RUT;
        private String nombre;
        private String direccion;
        private String celular;
        private String email;

        public ClienteBuilder(String RUT, String nombre) {
            this.RUT = RUT;
            this.nombre = nombre;
        }

        public ClienteBuilder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public ClienteBuilder celular(String celular) {
            this.celular = celular;
            return this;
        }

        public ClienteBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }


}
