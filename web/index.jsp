<%--
  Created by IntelliJ IDEA.
  User: 26626
  Date: 2021/9/25
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用mybatis创建ajax</title>
  </head>

  <script type="text/javascript" src="jquery/jquery-3.2.1.js"></script>
  <script type="text/javascript">

    $(function () {
      $("#mybut").click(function () {
        $.ajax({
          url:"Province",
          dataType:"json",
          success:function (data) {
            $("#myprovice").empty();
            $.each(data,function (i,n) {
              $("#myprovice").append(" <option value='"+n.id+"'>"+n.name+"</option>");
            })
          }
        })
      })
    })
  </script>
  <body>
  <p>用mybatis创建ajax</p>

  <table border="2">
    <tr>
      <td>省份：</td>
      <td>
        <select id="myprovice">
          <option value="0">请选择省份</option>
        </select>
        <input type="button" id="mybut" value="请按下">
      </td>
    </tr>
    <tr>
      <td>
        城市：
      </td>
      <td>
        <select id="mycity">
          <option value="0">请选择城市</option>
        </select>
      </td>
    </tr>
  </table>
  </body>
</html>
