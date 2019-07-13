<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>

    <script>
        $(function () {

            //发送ajax请求，加载所有省份数据
            $.get("area/provinceServlet",{},function (data) {
                //[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]

                //1.获取select
                var province = $("#province");
                province.empty();
                province.append("<option>--请选择省份--</option>");
                //2.遍历json数组
                $(data).each(function () {
                    //3.创建<option>
                    var option = "<option value='"+this.id+"'>"+this.name+"</option>";

                    //4.调用select的append追加option
                    province.append(option);
                });


            });

            $("#province").change(function () {
               alert($(this).val())
                $.get("area/getCity",{id:$(this).val()},function (data) {
                    //[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]

                    //1.获取select
                    var city = $("#city");
                    city.empty();
                    city.append("<option>--请选择市--</option>")
                    //2.遍历json数组
                    $(data).each(function () {
                        //3.创建<option>
                        var option = "<option value='"+this.id+"'>"+this.name+"</option>";

                        //4.调用select的append追加option
                        city.append(option);
                    });


                });
            });
            $("#city").change(function () {
                alert($(this).val())
                $.get("area/getCountry",{id:$(this).val()},function (data) {
                    //[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]

                    //1.获取select
                    var country = $("#country");
                    country.empty();
                    country.append("<option>--请选择县--</option>");
                    //2.遍历json数组
                    $(data).each(function () {
                        //3.创建<option>
                        var option = "<option value='"+this.id+"'>"+this.name+"</option>";

                        //4.调用select的append追加option
                        country.append(option);
                    });
                });
            });
        });

    /*function selectS() {
        alert("++")
        //发送ajax请求，加载所有省份数据
        $.get("/area/provinceServlet",{},function (data) {
            //[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]

            //1.获取select
            var province = $("#province");
            //2.遍历json数组
            $(data).each(function () {
                //3.创建<option>
                var option = "<option name='"+this.id+"'>"+this.name+"</option>";

                //4.调用select的append追加option
                province.append(option);
            });

        });
    }*/


    </script>

</head>
<body>



<select id="province">
    <option>--请选择省份--</option>

</select>
<select id="city">
    <option>--请选择市--</option>

</select>
<select id="country">
    <option>--请选择县--</option>

</select>
</body>
</html>