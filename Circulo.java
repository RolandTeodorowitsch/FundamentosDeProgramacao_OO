    public class Circulo {
        
        private double raio;
        
        public Circulo() {
            raio = 1.0;
        }
        
        public Circulo(double r) {
            raio = r;
        }
        
        public double circunferencia() {
            return 2.0 * Math.PI * raio;
        }
        
        public double area() {
            return Math.PI * raio * raio;
        }
    
        public double obtemRaio() {
                return raio;
        }
        
        public void defineRaio(double r) {
                raio = r;
        }
        
        public static double circunferencia(double r) {
            return 2.0 * Math.PI * r;
        }
        
        public static double area(double r) {
            return Math.PI * r * r;
        }
        
        public static Circulo comArea(double a) {
            double r = Math.sqrt( a / Math.PI );
            return new Circulo(r);
        }
    }
