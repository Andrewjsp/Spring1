<#assign springForm=JspTaglibs ["http://www.springframework.org/tags/form"]>

<table border="12">
    <tr>
        <td><b>Id</b></td>
        <td><b>Name</b></td>
        <td><b>Login</b></td>
        <td><b>Password</b></td>
        <td><b>Delete</b></td>
        <td><b>Edit</b></td>
    </tr>
<#list users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.login}</td>
        <td>${user.password}</td>
        <td>
          <@springForm.form action="/user/delete" method="post" modelAttribute="users">
              <input type="hidden" name="id" value="${user.id}"/>
              <button>Delete</button>
          </@springForm.form>
        </td>

    </tr>
</#list>
</table>




<a href="/add">Добавть новость</a>
