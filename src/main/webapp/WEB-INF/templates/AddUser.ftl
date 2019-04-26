<#assign springForm=JspTaglibs ["http://www.springframework.org/tags/form"]>

<@springForm.form action="/user/addUser" method="post" modelAttribute="user">
<div>
       <@springForm.input path="userName"></@springForm.input>
    <@springForm.input path="login"></@springForm.input>
    <@springForm.input path="password"></@springForm.input>
    <@springForm.button>Submit</@springForm.button>
</div>
</@springForm.form>