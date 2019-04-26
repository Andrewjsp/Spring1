<#assign springForm=JspTaglibs ["http://www.springframework.org/tags/form"]>

<@springForm.form action="/news/edit" method="post" modelAttribute="new">
<div>
    <input type="hidden" name="id" value="${new.id}"/>
    <@springForm.input path="title">Title</@springForm.input>
    <@springForm.input path="content">Content</@springForm.input>
    <@springForm.button>Submit</@springForm.button>
</div>
</@springForm.form>