
package Models;

public class EncabezadoFactura {
    
    private String codigo_encabezadoFactura;
    private String fecha_EncabezadoFactura;
    private double total_EncabezadoFactura;

    public EncabezadoFactura() {
    }

    public EncabezadoFactura(String codigo_encabezadoFactura, String fecha_EncabezadoFactura, double total_EncabezadoFactura) {
        this.codigo_encabezadoFactura = codigo_encabezadoFactura;
        this.fecha_EncabezadoFactura = fecha_EncabezadoFactura;
        this.total_EncabezadoFactura = total_EncabezadoFactura;
    }

    @Override
    public String toString() {
        return "EncabezadoFactura{" + "codigo_encabezadoFactura=" + getCodigo_encabezadoFactura() + ", fecha_EncabezadoFactura=" + getFecha_EncabezadoFactura() + ", total_EncabezadoFactura=" + getTotal_EncabezadoFactura() + '}';
    }

    /**
     * @return the codigo_encabezadoFactura
     */
    public String getCodigo_encabezadoFactura() {
        return codigo_encabezadoFactura;
    }

    /**
     * @param codigo_encabezadoFactura the codigo_encabezadoFactura to set
     */
    public void setCodigo_encabezadoFactura(String codigo_encabezadoFactura) {
        this.codigo_encabezadoFactura = codigo_encabezadoFactura;
    }

    /**
     * @return the fecha_EncabezadoFactura
     */
    public String getFecha_EncabezadoFactura() {
        return fecha_EncabezadoFactura;
    }

    /**
     * @param fecha_EncabezadoFactura the fecha_EncabezadoFactura to set
     */
    public void setFecha_EncabezadoFactura(String fecha_EncabezadoFactura) {
        this.fecha_EncabezadoFactura = fecha_EncabezadoFactura;
    }

    /**
     * @return the total_EncabezadoFactura
     */
    public double getTotal_EncabezadoFactura() {
        return total_EncabezadoFactura;
    }

    /**
     * @param total_EncabezadoFactura the total_EncabezadoFactura to set
     */
    public void setTotal_EncabezadoFactura(double total_EncabezadoFactura) {
        this.total_EncabezadoFactura = total_EncabezadoFactura;
    }
    
    
}
