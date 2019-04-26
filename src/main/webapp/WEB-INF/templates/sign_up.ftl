

<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

    <@sf.form action="/sign_up" method="post" modelAttribute="user">
       <div>
           <div class="form-style-2-heading">
               Зарегистрируйтесь!
           </div>
           <form method="post" action="/signUp">
               <label for="login">Логин
                   <input class="input-field" type="text" id="login" name="login">
               </label>
               <br>
               <label for="password">Пароль
                   <input class="input-field" type="password" id="password" name="password">
               </label>
               <br>
               <label for="login">Имя
                   <input class="input-field"  id="userName" name="userName">
               </label>
               <label for="remember-me">
                   <input type="checkbox" id="remember-me" name="remember-me">Запомнить меня</label>
               <input type="submit" value="SignUp">
               <br>
           </form>
       </div>
    </@sf.form>