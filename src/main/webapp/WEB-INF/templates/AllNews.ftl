<#assign springForm=JspTaglibs ["http://www.springframework.org/tags/form"]>
<table border="12">
    <tr>
        <td><b>Id</b></td>
        <td><b>Title</b></td>
        <td><b>Content</b></td>
        <td><b>Date</b></td>
        <td><b>Delete</b></td>
        <td><b>Edit</b></td>
    </tr>
<#list list as news>
    <tr>
        <td>${news.id}</td>
        <td>${news.title}</td>
        <td>${news.content}</td>
        <td>${news.date}</td>
        <td><@springForm.form action="/news/delete" method="post" modelAttribute="new">
            <input type="hidden" name="id" value="${news.id}"/>
        <input type="submit" value="Delete"/>
        </@springForm.form>
        </td>

        <td><@springForm.form action="/news/edit" method="get" modelAttribute="new">
            <input type="hidden" name="id" value="${news.id}"/>
            <input type="submit" value="Edit"/>
        </@springForm.form>
        </td>
    </tr>
</#list>
</table>


<a href="/news/add">Добавть новость</a>