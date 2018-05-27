<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Beispiel Systemanmeldung</title>
    </head>
    <body>
        <p><img src="images/LogoFeu.jpg"
                alt="FernUniversit&auml;t in Hagen"></p>
        <h1>Beispiel &quot;Systemanmeldung&quot;</h1>
        <h3>aus dem Kurs 01796, Kurseinheit 3</h3>
        
        <form method="POST"
              action="<c:url value='/bla'/>">
            <table cellpadding="10" style="border-collapse: collapse; border-width: 0">
                <tr>
                    <td>Benutzername:</td>
                    <td><input type="text" name="username" size="20"></td>
                </tr>
                <tr>
                    <td>Passwort:</td>
                    <td><input type="password" name="password" size="20"></td>
                </tr>
            </table>
            <p><input type="submit" value="Anmelden" name="buttonLogin"></p>
        </form>
            
        <c:if test="${not empty errorOccurred}">
            <p><span style="color: rgb(255, 0, 0);">Sie konnten nicht authentifiziert werden.</span></p>
        </c:if>
            
    </body>
</html>