<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${request.contextPath}/dwr/engine.js"></script>
    <script type="text/javascript" src="${request.contextPath}/dwr/interface/salutatore.js"></script>
    <title>DWR Example</title>
    <script type="text/javascript">
        salutatore.saluta("pippo" , {
          callback:function(str) { 
            alert(str); 
          }
        });

      </script>
  </head>
  <body>
    <h1>DWR Example</h1>
  </body>
</html>
