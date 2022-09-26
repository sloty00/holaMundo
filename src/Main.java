public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NombreCompleto nombrecom = new NombreCompleto.Builder("123-456")
                .conNombres("Jose Arnoldo")
                .conApellidos("Vargas Oyarzun")
                .build();
        System.out.println(nombrecom.getNumero());
        System.out.println(nombrecom.getNombres());
        System.out.println(nombrecom.getApellidos());
    }

}



class NombreCompleto {

    private String Numero;
    private String Nombres;
    private String Apellidos;

    public static class Builder {

        private String Numero;
        private String Nombres;
        private String Apellidos;

        public Builder(String Numero) {
            this.Numero = Numero;
        }

        public Builder conNombres(String Nombres) {
            this.Nombres = Nombres;
            return this;
        }

        public Builder conApellidos(String Apellidos) {
            this.Apellidos = Apellidos;
            return this;
        }

        public NombreCompleto build() {

            NombreCompleto nombrecom = new NombreCompleto();
            nombrecom.Numero = this.Numero;
            nombrecom.Nombres = this.Nombres;
            nombrecom.Apellidos = this.Apellidos;

            return nombrecom;
        }
    }

    private NombreCompleto() {

    }

    public String getNumero() {
        return Numero;
    }
    public void setNumero(String Numero) {
        Nombres = Numero;
    }
    public String getNombres() {
        return Nombres;
    }
    public void setNombres(String nombres) {
        Nombres = nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
}