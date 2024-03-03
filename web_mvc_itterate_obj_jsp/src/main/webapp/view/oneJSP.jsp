<html>
    <head>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    </head>
    <body>
        <table>
            <tr>
                <th>book Id</th>
                <th> book Name</th>
                <th>book price</th>
            </tr>
            <tr>
<c:forEach item ="${books}" var ="bookobj">
    <td>${bookobj.id}</td>
    <td>${bookobj.bookName}</td>
    <td>${bookobj.bookPrice}</td>
</c:forEach>
            </tr>
        </table>
    </body>
    </html>