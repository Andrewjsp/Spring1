<#assign springForm=JspTaglibs ["http://www.springframework.org/tags/form"]>

<@springForm.form action="/news/add" method="post" modelAttribute="new">
<div>
    <@springForm.label path="title">Title:</@springForm.label>
    <@springForm.input path="title">Title</@springForm.input>
</div>

<div>
    <@springForm.label path="content">Content:</@springForm.label>
    <@springForm.input path="content">Content</@springForm.input>
</div>

<div>
    <@springForm.label path="date">Date:</@springForm.label>
    <@springForm.input path="date"></@springForm.input>
</div>
    <@springForm.button value"Submit">Submit</@springForm.button>
</@springForm.form>