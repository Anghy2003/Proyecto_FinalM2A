
package Models;

public class DetalleFactura {
    
    private String codigo_DetalleFactura;
    private String cantidad_DetalleFactura;

    public DetalleFactura() {
    }

    public DetalleFactura(String codigo_DetalleFactura, String cantidad_DetalleFactura) {
        this.codigo_DetalleFactura = codigo_DetalleFactura;
        this.cantidad_DetalleFactura = cantidad_DetalleFactura;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "codigo_DetalleFactura=" + getCodigo_DetalleFactura() + ", cantidad_DetalleFactura=" + getCantidad_DetalleFactura() + '}';
    }

    /**
     * @return the codigo_DetalleFactura
     */
    public String getCodigo_DetalleFactura() {
        return codigo_DetalleFactura;
    }

    /**
     * @param codigo_DetalleFactura the codigo_DetalleFactura to set
     */
    public void setCodigo_DetalleFactura(String codigo_DetalleFactura) {
        this.codigo_DetalleFactura = codigo_DetalleFactura;
    }

    /**
     * @return the cantidad_DetalleFactura
     */
    public String getCantidad_DetalleFactura() {
        return cantidad_DetalleFactura;
    }

    /**
     * @param cantidad_DetalleFactura the cantidad_DetalleFactura to set
     */
    public void setCantidad_DetalleFactura(String cantidad_DetalleFactura) {
        this.cantidad_DetalleFactura = cantidad_DetalleFactura;
    }
    
    
}
