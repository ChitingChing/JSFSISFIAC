/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encriptacion;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author KevinArnold
 */

@WebFilter("*.xhtml")
public class SessionUrlFilter implements Filter{

    FilterConfig filterConfig;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig=filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;
        HttpSession session=req.getSession(true);
        
        String requestUrl=req.getRequestURL().toString();
        
        String[] urlPermitidaSinSesion=new String[]
        {
            "faces/index.xhtml",
            "faces/login.xhtml",
            "faces/Admin/permisosUsuarios.xhtml",
            "faces/Admin/eliminarPermisosUsuarios.xhtml",
            "faces/Modulos/Academico/solicitudInscripcion.xhtml",
            "faces/Modulos/Academico/registrarMaestria.xhtml",
            "faces/Modulos/Academico/permisosUsuarios.xhtml",
            "faces/Modulos/Biblioteca/principaltesis.xhtml",
            "faces/exito.xhtml"
        };
        
        boolean redireccionarPeticion;
        
        if(session.getAttribute("usuario")==null)
        {            
            redireccionarPeticion=true;
            
            for(String item : urlPermitidaSinSesion)
            {
                if(requestUrl.contains(item))
                {
                    redireccionarPeticion=false;
                    
                    break;
                }
            }
        }
        else
        {
            redireccionarPeticion=false;
        }
        
        if(redireccionarPeticion)
        {
            res.sendRedirect(req.getContextPath()+"/faces/index.xhtml");
        }
        else
        {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        this.filterConfig=null;
    }
    
}
