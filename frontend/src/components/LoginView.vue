<template>
    <form name="login-form">
        <div class="username-class">
            <label for="username">Username: </label>
            <input type="text" id="username" v-model="input.username"/>
        </div>
        <div class="password-class">
            <label for="password">Password: </label>
            <input type="text" id="password" v-model="input.password"/>
        </div>
        <button class="login-form-button" type="submit">Login</button>
    </form>
</template>
<script>
export default {
    name: "LoginView",
    data(){
        return{
            input:{
                username: "",
                password: ""
            }
        }
    }
}
</script>