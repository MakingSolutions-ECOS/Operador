
package com.making.cp.cliente.notificacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.making.cp.cliente.notificacion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CambiarEstadoNotificacionResponse_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "cambiarEstadoNotificacionResponse");
    private final static QName _ObtenerNotificacionEstados_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerNotificacionEstados");
    private final static QName _AsignarNotificacionResponse_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "asignarNotificacionResponse");
    private final static QName _ObtenerNotificacionCiudadano_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerNotificacionCiudadano");
    private final static QName _ObtenerNotificacionCiudadanoEstado_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerNotificacionCiudadanoEstado");
    private final static QName _ObtenerNotificacionCiudadanoResponse_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerNotificacionCiudadanoResponse");
    private final static QName _ObtenerNotificacionCiudadanoEstadoResponse_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerNotificacionCiudadanoEstadoResponse");
    private final static QName _AsignarNotificacion_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "asignarNotificacion");
    private final static QName _CambiarEstadoNotificacion_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "cambiarEstadoNotificacion");
    private final static QName _ObtenerNotificacionEstadosResponse_QNAME = new QName("http://services.ecos.edu.uniandes.co/", "obtenerNotificacionEstadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.making.cp.cliente.notificacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerNotificacionEstadosResponse }
     * 
     */
    public ObtenerNotificacionEstadosResponse createObtenerNotificacionEstadosResponse() {
        return new ObtenerNotificacionEstadosResponse();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionEstados }
     * 
     */
    public ObtenerNotificacionEstados createObtenerNotificacionEstados() {
        return new ObtenerNotificacionEstados();
    }

    /**
     * Create an instance of {@link CambiarEstadoNotificacionResponse }
     * 
     */
    public CambiarEstadoNotificacionResponse createCambiarEstadoNotificacionResponse() {
        return new CambiarEstadoNotificacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionCiudadanoResponse }
     * 
     */
    public ObtenerNotificacionCiudadanoResponse createObtenerNotificacionCiudadanoResponse() {
        return new ObtenerNotificacionCiudadanoResponse();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionCiudadanoEstado }
     * 
     */
    public ObtenerNotificacionCiudadanoEstado createObtenerNotificacionCiudadanoEstado() {
        return new ObtenerNotificacionCiudadanoEstado();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionCiudadano }
     * 
     */
    public ObtenerNotificacionCiudadano createObtenerNotificacionCiudadano() {
        return new ObtenerNotificacionCiudadano();
    }

    /**
     * Create an instance of {@link AsignarNotificacionResponse }
     * 
     */
    public AsignarNotificacionResponse createAsignarNotificacionResponse() {
        return new AsignarNotificacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerNotificacionCiudadanoEstadoResponse }
     * 
     */
    public ObtenerNotificacionCiudadanoEstadoResponse createObtenerNotificacionCiudadanoEstadoResponse() {
        return new ObtenerNotificacionCiudadanoEstadoResponse();
    }

    /**
     * Create an instance of {@link CambiarEstadoNotificacion }
     * 
     */
    public CambiarEstadoNotificacion createCambiarEstadoNotificacion() {
        return new CambiarEstadoNotificacion();
    }

    /**
     * Create an instance of {@link AsignarNotificacion }
     * 
     */
    public AsignarNotificacion createAsignarNotificacion() {
        return new AsignarNotificacion();
    }

    /**
     * Create an instance of {@link MunicipioDto }
     * 
     */
    public MunicipioDto createMunicipioDto() {
        return new MunicipioDto();
    }

    /**
     * Create an instance of {@link NotificacionEstadoDto }
     * 
     */
    public NotificacionEstadoDto createNotificacionEstadoDto() {
        return new NotificacionEstadoDto();
    }

    /**
     * Create an instance of {@link DepartamentoDto }
     * 
     */
    public DepartamentoDto createDepartamentoDto() {
        return new DepartamentoDto();
    }

    /**
     * Create an instance of {@link EmisorDto }
     * 
     */
    public EmisorDto createEmisorDto() {
        return new EmisorDto();
    }

    /**
     * Create an instance of {@link RolPermisoDto }
     * 
     */
    public RolPermisoDto createRolPermisoDto() {
        return new RolPermisoDto();
    }

    /**
     * Create an instance of {@link TramiteActividadDto }
     * 
     */
    public TramiteActividadDto createTramiteActividadDto() {
        return new TramiteActividadDto();
    }

    /**
     * Create an instance of {@link PermisoDto }
     * 
     */
    public PermisoDto createPermisoDto() {
        return new PermisoDto();
    }

    /**
     * Create an instance of {@link RespuestaService }
     * 
     */
    public RespuestaService createRespuestaService() {
        return new RespuestaService();
    }

    /**
     * Create an instance of {@link TipoPersonaDto }
     * 
     */
    public TipoPersonaDto createTipoPersonaDto() {
        return new TipoPersonaDto();
    }

    /**
     * Create an instance of {@link NacionalidadDto }
     * 
     */
    public NacionalidadDto createNacionalidadDto() {
        return new NacionalidadDto();
    }

    /**
     * Create an instance of {@link CategoriasTramiteDto }
     * 
     */
    public CategoriasTramiteDto createCategoriasTramiteDto() {
        return new CategoriasTramiteDto();
    }

    /**
     * Create an instance of {@link TramiteDto }
     * 
     */
    public TramiteDto createTramiteDto() {
        return new TramiteDto();
    }

    /**
     * Create an instance of {@link RespuestaNotificacionEstado }
     * 
     */
    public RespuestaNotificacionEstado createRespuestaNotificacionEstado() {
        return new RespuestaNotificacionEstado();
    }

    /**
     * Create an instance of {@link TramiteEstadoDto }
     * 
     */
    public TramiteEstadoDto createTramiteEstadoDto() {
        return new TramiteEstadoDto();
    }

    /**
     * Create an instance of {@link NotificacionDto }
     * 
     */
    public NotificacionDto createNotificacionDto() {
        return new NotificacionDto();
    }

    /**
     * Create an instance of {@link TipoIdentificacionDto }
     * 
     */
    public TipoIdentificacionDto createTipoIdentificacionDto() {
        return new TipoIdentificacionDto();
    }

    /**
     * Create an instance of {@link CiudadanoDto }
     * 
     */
    public CiudadanoDto createCiudadanoDto() {
        return new CiudadanoDto();
    }

    /**
     * Create an instance of {@link UsuarioDto }
     * 
     */
    public UsuarioDto createUsuarioDto() {
        return new UsuarioDto();
    }

    /**
     * Create an instance of {@link RolDto }
     * 
     */
    public RolDto createRolDto() {
        return new RolDto();
    }

    /**
     * Create an instance of {@link TramiteDefinicionDto }
     * 
     */
    public TramiteDefinicionDto createTramiteDefinicionDto() {
        return new TramiteDefinicionDto();
    }

    /**
     * Create an instance of {@link DocumentoRequeridoTramiteDto }
     * 
     */
    public DocumentoRequeridoTramiteDto createDocumentoRequeridoTramiteDto() {
        return new DocumentoRequeridoTramiteDto();
    }

    /**
     * Create an instance of {@link OperadorDto }
     * 
     */
    public OperadorDto createOperadorDto() {
        return new OperadorDto();
    }

    /**
     * Create an instance of {@link SuscripcionDto }
     * 
     */
    public SuscripcionDto createSuscripcionDto() {
        return new SuscripcionDto();
    }

    /**
     * Create an instance of {@link MetadataTipoDocumentoDto }
     * 
     */
    public MetadataTipoDocumentoDto createMetadataTipoDocumentoDto() {
        return new MetadataTipoDocumentoDto();
    }

    /**
     * Create an instance of {@link RespuestaNotificacion }
     * 
     */
    public RespuestaNotificacion createRespuestaNotificacion() {
        return new RespuestaNotificacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoNotificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "cambiarEstadoNotificacionResponse")
    public JAXBElement<CambiarEstadoNotificacionResponse> createCambiarEstadoNotificacionResponse(CambiarEstadoNotificacionResponse value) {
        return new JAXBElement<CambiarEstadoNotificacionResponse>(_CambiarEstadoNotificacionResponse_QNAME, CambiarEstadoNotificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionEstados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerNotificacionEstados")
    public JAXBElement<ObtenerNotificacionEstados> createObtenerNotificacionEstados(ObtenerNotificacionEstados value) {
        return new JAXBElement<ObtenerNotificacionEstados>(_ObtenerNotificacionEstados_QNAME, ObtenerNotificacionEstados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarNotificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "asignarNotificacionResponse")
    public JAXBElement<AsignarNotificacionResponse> createAsignarNotificacionResponse(AsignarNotificacionResponse value) {
        return new JAXBElement<AsignarNotificacionResponse>(_AsignarNotificacionResponse_QNAME, AsignarNotificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerNotificacionCiudadano")
    public JAXBElement<ObtenerNotificacionCiudadano> createObtenerNotificacionCiudadano(ObtenerNotificacionCiudadano value) {
        return new JAXBElement<ObtenerNotificacionCiudadano>(_ObtenerNotificacionCiudadano_QNAME, ObtenerNotificacionCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionCiudadanoEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerNotificacionCiudadanoEstado")
    public JAXBElement<ObtenerNotificacionCiudadanoEstado> createObtenerNotificacionCiudadanoEstado(ObtenerNotificacionCiudadanoEstado value) {
        return new JAXBElement<ObtenerNotificacionCiudadanoEstado>(_ObtenerNotificacionCiudadanoEstado_QNAME, ObtenerNotificacionCiudadanoEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerNotificacionCiudadanoResponse")
    public JAXBElement<ObtenerNotificacionCiudadanoResponse> createObtenerNotificacionCiudadanoResponse(ObtenerNotificacionCiudadanoResponse value) {
        return new JAXBElement<ObtenerNotificacionCiudadanoResponse>(_ObtenerNotificacionCiudadanoResponse_QNAME, ObtenerNotificacionCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionCiudadanoEstadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerNotificacionCiudadanoEstadoResponse")
    public JAXBElement<ObtenerNotificacionCiudadanoEstadoResponse> createObtenerNotificacionCiudadanoEstadoResponse(ObtenerNotificacionCiudadanoEstadoResponse value) {
        return new JAXBElement<ObtenerNotificacionCiudadanoEstadoResponse>(_ObtenerNotificacionCiudadanoEstadoResponse_QNAME, ObtenerNotificacionCiudadanoEstadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignarNotificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "asignarNotificacion")
    public JAXBElement<AsignarNotificacion> createAsignarNotificacion(AsignarNotificacion value) {
        return new JAXBElement<AsignarNotificacion>(_AsignarNotificacion_QNAME, AsignarNotificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarEstadoNotificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "cambiarEstadoNotificacion")
    public JAXBElement<CambiarEstadoNotificacion> createCambiarEstadoNotificacion(CambiarEstadoNotificacion value) {
        return new JAXBElement<CambiarEstadoNotificacion>(_CambiarEstadoNotificacion_QNAME, CambiarEstadoNotificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNotificacionEstadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ecos.edu.uniandes.co/", name = "obtenerNotificacionEstadosResponse")
    public JAXBElement<ObtenerNotificacionEstadosResponse> createObtenerNotificacionEstadosResponse(ObtenerNotificacionEstadosResponse value) {
        return new JAXBElement<ObtenerNotificacionEstadosResponse>(_ObtenerNotificacionEstadosResponse_QNAME, ObtenerNotificacionEstadosResponse.class, null, value);
    }

}
