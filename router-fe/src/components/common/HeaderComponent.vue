<template>
    <header class="header">
      <nav>
        <div class="logo"><router-link to = "/"><img src = ''></router-link></div>
        <ul>
          <li><router-link to="/recruitment">채용</router-link></li>
          <li><router-link to="/portfolio">포트폴리오</router-link></li>
          <li><router-link to="/education">교육</router-link></li>
          <li><router-link to="/activity">대외활동</router-link></li>
        </ul>
      </nav>
      
      <div class="user">
        <button v-if="isLoggedIn">내 정보</button>
        <button v-else>로그인</button>
      </div>
    </header>
  </template>
  
  <script>
  export default {
    props: ['isLoggedIn'],
  };
  </script>
  
  <style scoped>
  .header {
    display: flex;
    justify-content: space-between;
    padding: 10px;
    background-color: #f8f8f8;
  }
  nav ul {
    display: flex;
    list-style: none;
  }
  nav li {
    margin: 0 15px;
  }
  </style>