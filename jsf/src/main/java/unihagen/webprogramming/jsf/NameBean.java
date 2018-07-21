package unihagen.webprogramming.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class NameBean {

    private String name;
    private String surname;

    private String nameSum;

    public String navigate() {
        nameSum = name + " " + surname;
        return "result.xhtml";
    }

//    manage pages via dispatch
//    <h:commandButton id="send" value="send" action="#{nameBean.send}" />
//    public void send() {
//        nameSum = name + " " + surname;
//
//        try {
//            FacesContext.getCurrentInstance()
//                    .getExternalContext()
//                    .dispatch("result.xhtml");
//        } catch (IOException e) {
//        }
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNameSum() {
        return nameSum;
    }
}
