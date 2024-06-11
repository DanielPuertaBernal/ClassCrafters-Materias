package co.edu.uco.tutorspace.crosscutting.exceptions.messagecatalog.impl;

import java.util.HashMap;
import java.util.Map;

import co.edu.uco.tutorspace.crosscutting.exceptions.customs.CrossCuttingTutorSpaceException;
import co.edu.uco.tutorspace.crosscutting.exceptions.messagecatalog.MessageCatalog;
import co.edu.uco.tutorspace.crosscutting.exceptions.messagecatalog.MessageCatalogStrategy;
import co.edu.uco.tutorspace.crosscutting.exceptions.messagecatalog.data.CodigoMensaje;
import co.edu.uco.tutorspace.crosscutting.exceptions.messagecatalog.data.Mensaje;
import co.edu.uco.tutorspace.crosscutting.helpers.ObjectHelper;
import co.edu.uco.tutorspace.crosscutting.helpers.TextHelper;

public class MessageCatalogExternalService implements MessageCatalog {

	private final Map<String, Mensaje> mensajes = new HashMap<>();

    @Override
    public final void inicializar() {

        mensajes.clear();
        mensajes.put(CodigoMensaje.M00023.getIdentificador(), new Mensaje(CodigoMensaje.M00023, "Se ha presentado un problema tratando de obtener la conexión con la base de datos PostgreSQL. Por favor revise la traza de errores para identificar y solucionar el problema"));

        mensajes.put(CodigoMensaje.M00024.getIdentificador(), new Mensaje(CodigoMensaje.M00024,
                "Se ha presentado un problema INESPERADO tratando de obtener la conexión con la base de datos PostgreSQL. Por favor revise la traza de errores para identificar y solucionar el problema..."));

        mensajes.put((CodigoMensaje.M00025.getIdentificador()), new Mensaje(CodigoMensaje.M00025,
                "No es posible crear el DAO deseado con una conexión cerrada..."));

        mensajes.put((CodigoMensaje.M00026.getIdentificador()),new Mensaje(CodigoMensaje.M00026,
                "Se ha presentado un problema tratando de consultar los tipos de documento. Por favor, contacte al administrador del sistema."));

        mensajes.put((CodigoMensaje.M00027.getIdentificador()), new Mensaje(CodigoMensaje.M00027,
                "Se ha presentado una SQLException tratando de realizar la consulta de los tipos de documentos en la tabla \"TipoDocumento\" de la base de datos PostgreSQL."));

        mensajes.put((CodigoMensaje.M00028.getIdentificador()), new Mensaje(CodigoMensaje.M00028,
                "Se ha presentado un problema tratando de consultar los tipos de documento. Por favor, contacte al administrador del sistema."));

        mensajes.put((CodigoMensaje.M00029.getIdentificador()), new Mensaje(CodigoMensaje.M00029,
                "Se ha presentado un problema INESPERADO con una excepción de tipo Exception tratando de realizar la consulta de los tipos de documentos en la tabla \"TipoDocumento\" de la base de datos PostgreSQL."));

        mensajes.put((CodigoMensaje.M00030.getIdentificador()),new Mensaje(CodigoMensaje.M00030,
                "Se ha presentado un problema tratando de crear el perfil . Por favor intente de nuevo y si el problema persiste contacte con el administrador..."));

        mensajes.put((CodigoMensaje.M00031.getIdentificador()), new Mensaje(CodigoMensaje.M00031,"Se ha presentado una excepcion de tipo SQLException tratando de realizar el insert del perfil  en la tabla \"Perfil\" de la base de datos " +
                "PostgreSQL. Para más detalles, revise de forma completa la excepción raíz presentada.."));

        mensajes.put((CodigoMensaje.M00032.getIdentificador()), new Mensaje(CodigoMensaje.M00032,
                "Se ha presentado un problema tratando de registrar el perfil \"%s\". Por favor intente de nuevo y si el problema persiste contacte con el administrador..."));

        mensajes.put((CodigoMensaje.M00033.getIdentificador()), new Mensaje(CodigoMensaje.M00033,
                "Se ha presentado un problema INESPERADO de tipo Exception tratando de realizar el insert del perfil  en la tabla \"Perfil\" de la base de datos PostgreSQL. Para más detalles, revise de forma completa la excepción raíz presentada.."));

        mensajes.put((CodigoMensaje.M00034.getIdentificador()),new Mensaje(CodigoMensaje.M00034,
                "Se ha presentado un problema tratando de consultar el perfil. Por favor, contacte al administrador del sistema."));

        mensajes.put((CodigoMensaje.M00035.getIdentificador()),new Mensaje(CodigoMensaje.M00035,
                "Se ha presentado una SQLException tratando de realizar la consulta de los perfiles en la tabla \"Perfil\" de la base de datos PostgreSQL."));

        mensajes.put((CodigoMensaje.M00036.getIdentificador()), new Mensaje(CodigoMensaje.M00036,
                "Se ha presentado un problema tratando de consultar los perfiles. Por favor, contacte al administrador del sistema."));

        mensajes.put((CodigoMensaje.M00037.getIdentificador()), new Mensaje(CodigoMensaje.M00037,
                "Se ha presentado un problema INESPERADO con una excepción de tipo Exception tratando de realizar la consulta de los perfiles en la tabla \"Perfil\" de la base de datos PostgreSQL."));

        mensajes.put((CodigoMensaje.M00038.getIdentificador()),new Mensaje(CodigoMensaje.M00038,
                "Se ha presentado un problema tratando de consultar las divisas. Por favor, contacte al administrador del sistema."));

        mensajes.put((CodigoMensaje.M00039.getIdentificador()),new Mensaje(CodigoMensaje.M00039,
                "Se ha presentado una SQLException tratando de realizar la consulta de las divisas en la tabla \"Divisa\" de la base de datos PostgreSQL." ));

        mensajes.put((CodigoMensaje.M00040.getIdentificador()), new Mensaje(CodigoMensaje.M00040,
                "Se ha presentado un problema tratando de consultar las divisas. Por favor, contacte al administrador del sistema."));

        mensajes.put((CodigoMensaje.M00041.getIdentificador()), new Mensaje(CodigoMensaje.M00041,
                "Se ha presentado un problema INESPERADO con una excepción de tipo Exception tratando de realizar la consulta de las divisas en la tabla \"Divisa\" de la base de datos PostgreSQL."));

        mensajes.put((CodigoMensaje.M00042.getIdentificador()), new Mensaje(CodigoMensaje.M00042,
                "Se ha presentado un problema tratando de llevar a cabo la consulta de los tipos de documento"));

        mensajes.put((CodigoMensaje.M00043.getIdentificador()), new Mensaje(CodigoMensaje.M00043,
                "El DAOFactory de consultar los tiposDocumentos llego nulo..."));

        mensajes.put((CodigoMensaje.M00044.getIdentificador()), new Mensaje(CodigoMensaje.M00044,
                "Se ha presentado un problema tratando de llevar la consulta de los perfiles"));

        mensajes.put((CodigoMensaje.M00045.getIdentificador()), new Mensaje(CodigoMensaje.M00045,
                "El DAOFactory de consultar los perfiles llego nulo..."));

        mensajes.put((CodigoMensaje.M00046.getIdentificador()), new Mensaje(CodigoMensaje.M00046,
                "Se ha presentado un problema tratando de llevar la consulta de las divisas"));

        mensajes.put((CodigoMensaje.M00047.getIdentificador()), new Mensaje(CodigoMensaje.M00047,
                "El DAOFactory de consultar las divisas llego nulo..."));

        mensajes.put((CodigoMensaje.M00048.getIdentificador()), new Mensaje(CodigoMensaje.M00048,
                "Se ha presentado un problema tratando de consultar la informacion de las divisas"));

        mensajes.put((CodigoMensaje.M00049.getIdentificador()), new Mensaje(CodigoMensaje.M00049,
                "Se ha presentado un problema INESPERADO tratando de consultar las divisas"));

        mensajes.put((CodigoMensaje.M00050.getIdentificador()), new Mensaje(CodigoMensaje.M00050,
                "Se ha presentado un problema consultar la informacion de los perfiles"));

        mensajes.put((CodigoMensaje.M00051.getIdentificador()), new Mensaje(CodigoMensaje.M00051,
                "Se ha presentado un problema INESPERADO tratando de consultar los perfiles"));

        mensajes.put((CodigoMensaje.M00052.getIdentificador()), new Mensaje(CodigoMensaje.M00052,
                "Se ha presentado un problema tratando de registrar la información"));

        mensajes.put((CodigoMensaje.M00053.getIdentificador()), new Mensaje(CodigoMensaje.M00053,
                "Se ha presentado un problema INESPERADO tratando de registrar la información"));

        mensajes.put((CodigoMensaje.M00054.getIdentificador()), new Mensaje(CodigoMensaje.M00054,
                "Se ha presentado un problema consultar la informacion de los tipos de documentos"));

        mensajes.put((CodigoMensaje.M00055.getIdentificador()), new Mensaje(CodigoMensaje.M00055,
                "Se ha presentado un problema INESPERADO tratando de consultar los tiposDocumentos"));

        mensajes.put((CodigoMensaje.M00056.getIdentificador()), new Mensaje(CodigoMensaje.M00056,
                "Se ha presentado un problema tratando de registar el nuevo Perfil"));

        mensajes.put((CodigoMensaje.M00057.getIdentificador()), new Mensaje(CodigoMensaje.M00057,
                "Divisas consultadas exitosamente..."));

        mensajes.put((CodigoMensaje.M00058.getIdentificador()), new Mensaje(CodigoMensaje.M00058,
                "Perfiles consultados exitosamente..."));

        mensajes.put((CodigoMensaje.M00059.getIdentificador()), new Mensaje(CodigoMensaje.M00059,
                "Tipos de documento consultados exitosamente..."));

        mensajes.put((CodigoMensaje.M00060.getIdentificador()), new Mensaje(CodigoMensaje.M00060,
                "Perfil registrado exitosamente..."));

        mensajes.put((CodigoMensaje.M00061.getIdentificador()), new Mensaje(CodigoMensaje.M00061,
                "El DAO Factory para registrar el perfil llegó nulo"));

        mensajes.put((CodigoMensaje.M00062.getIdentificador()), new Mensaje(CodigoMensaje.M00062,
                "No puede ser nulo"));

        mensajes.put((CodigoMensaje.M00063.getIdentificador()), new Mensaje(CodigoMensaje.M00063,
                "El nombre debe contener solo letras..."));

        mensajes.put((CodigoMensaje.M00064.getIdentificador()), new Mensaje(CodigoMensaje.M00064,
                "Debe tener entre 1 y 20 caracteres..."));

        mensajes.put((CodigoMensaje.M00065.getIdentificador()), new Mensaje(CodigoMensaje.M00065,
                "El nombre de usuario debe contener solo letras y números..."));

        mensajes.put((CodigoMensaje.M00066.getIdentificador()), new Mensaje(CodigoMensaje.M00066,
                "El nombre de usuario debe tener entre 1 y 25 caracteres.."));

        mensajes.put((CodigoMensaje.M00067.getIdentificador()), new Mensaje(CodigoMensaje.M00067,
                "La contraseña debe contener como minimo entre 8 y 30 caracteres..."));

        mensajes.put((CodigoMensaje.M00068.getIdentificador()), new Mensaje(CodigoMensaje.M00068,
                "La contraseña debe contener como minimo un número , una letra mayúscula, una minuscula y un caracter especial..."));

        mensajes.put((CodigoMensaje.M00069.getIdentificador()), new Mensaje(CodigoMensaje.M00069,
                "El correo electrónico no tiene un formato válido"));

        mensajes.put((CodigoMensaje.M00070.getIdentificador()), new Mensaje(CodigoMensaje.M00070,
                "El correo debe tener entre 6 y 256 caracteres"));

        mensajes.put((CodigoMensaje.M00071.getIdentificador()), new Mensaje(CodigoMensaje.M00071,
                "Ya existe un perfil con el mismo nombre de usuario..."));

        mensajes.put((CodigoMensaje.M00072.getIdentificador()), new Mensaje(CodigoMensaje.M00072,
                "Ya existe un peril con el mismo correo electrónico asociado..."));

        mensajes.put((CodigoMensaje.M00073.getIdentificador()), new Mensaje(CodigoMensaje.M00073,
                "Ya existe un peril con el mismo número de documento..."));

        mensajes.put((CodigoMensaje.M00074.getIdentificador()), new Mensaje(CodigoMensaje.M00074,
                "Los datos proporcionados, no cumplen con los requisitos (tipo de dato, obligaoriedad, longitud, formato y rango)..."));

        mensajes.put((CodigoMensaje.M00075.getIdentificador()), new Mensaje(CodigoMensaje.M00075,
                "El nombre de usuario que se ingresó, es unico de cada perfil, por lo tanto ya se encuentra registrado en la base de datos."));


        mensajes.put((CodigoMensaje.M00076.getIdentificador()), new Mensaje(CodigoMensaje.M00076,
                "El tipo de documento con el que tratas de registrarte no existe en el sistema "));

        mensajes.put((CodigoMensaje.M00077.getIdentificador()), new Mensaje(CodigoMensaje.M00077,
                "El tipo documento seleccionado no se encuentra almacenado en la base de datos, verifica con el administrador del sistema"));

        mensajes.put((CodigoMensaje.M00078.getIdentificador()), new Mensaje(CodigoMensaje.M00078,
                "La divisa con la que tratas de registrarte no existe en el sistema "));

        mensajes.put((CodigoMensaje.M00079.getIdentificador()), new Mensaje(CodigoMensaje.M00079,
                "La divisa seleccionada no se encuentra almacenada en la base de datos, verifica con el administrador del sistema"));



        mensajes.put((CodigoMensaje.M00080.getIdentificador()), new Mensaje(CodigoMensaje.M00080,
                "El correo que se ingresó, es unico de cada perfil, por lo tanto ya se encuentra registrado en la base de datos."));

        mensajes.put((CodigoMensaje.M00081.getIdentificador()), new Mensaje(CodigoMensaje.M00081,
                "El numero de documento que se ingresó, es unico de cada perfil, por lo tanto ya se encuentra registrado en la base de datos."));

        mensajes.put((CodigoMensaje.M00082.getIdentificador()), new Mensaje(CodigoMensaje.M00082,
                "El apellido debe contener solo letras..."));

        mensajes.put((CodigoMensaje.M00083.getIdentificador()), new Mensaje(CodigoMensaje.M00083,
                "La divisa y el tipo de documento que tratas de registrar no existen en el sistema"));


        mensajes.put((CodigoMensaje.M00084.getIdentificador()), new Mensaje(CodigoMensaje.M00084,
                "El tipo documento seleccionado y la divisa no se encuentra almacenado en la base de datos, verifica con el administrador del sistema"));

        mensajes.put((CodigoMensaje.M00085.getIdentificador()), new Mensaje(CodigoMensaje.M00085,
                "El número de documento debe contener solo numeros."));

        mensajes.put((CodigoMensaje.M00086.getIdentificador()), new Mensaje(CodigoMensaje.M00086,
                "El número de documento ingresado esta violando el tipo de dato long"));

        mensajes.put((CodigoMensaje.M00087.getIdentificador()), new Mensaje(CodigoMensaje.M00087,
                "El número de documento debe tener entre 1 y 10 caracteres."));

        mensajes.put((CodigoMensaje.M00088.getIdentificador()), new Mensaje(CodigoMensaje.M00088,
                "Los datos proporcionados, no cumplen con los requisitos de rango del atributo \""));
    }

    @Override
    public final String obtenerContendidoMensaje(final CodigoMensaje codigo, final String... parametros) {
        return obtenerMensaje(codigo,parametros).getContenido();
    }

    @Override
    public final Mensaje obtenerMensaje(final CodigoMensaje codigo, final String... parametros) {

        if(ObjectHelper.getObjectHelper().isNull(codigo)){
            var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
            var mensajeTecnico = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00001);
            throw new CrossCuttingTutorSpaceException(mensajeTecnico, mensajeUsuario);
        }

        if(codigo.isBase()) {
            var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
            var mensajeTecnico = TextHelper.reemplazarParametro(MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00005,codigo.getIdentificador()));
            throw new CrossCuttingTutorSpaceException(mensajeTecnico, mensajeUsuario);
        }

        if(!mensajes.containsKey(codigo.getIdentificador())) {
            var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00002);
            var mensajeTecnico = TextHelper.reemplazarParametro(MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M00006,codigo.getIdentificador()));
            throw new CrossCuttingTutorSpaceException(mensajeTecnico, mensajeUsuario);
        }

        return mensajes.get(codigo.getIdentificador());
    }
}
