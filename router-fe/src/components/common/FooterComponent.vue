<template>
    <footer class="footer">
      <div>
        <ul>
          <li class = "footer-logo">데이터</li>
          <div class="copyright">© 2024 라우터. All rights reserved.</div>
          <li class = "footer-cs">고객접수</li>
        </ul>
      </div>
    </footer>
  </template>
  
  <style scoped>
  .footer-logo {
    text-align: left;
    padding: auto;
    background-color: #f1f1f1;
  }

  .copyright {
    text-align: center;
    padding: 20px;
    background-color: #f1f1f1;
  }

  .footer ul {
    list-style: none; /* 기본 리스트 스타일 제거 */
    padding: 0;       /* 패딩 제거 */
    display: flex;    /* 가로로 정렬 */
    justify-content: center; /* 가운데 정렬 */
  }

  .footer li {
    margin: 0 15px;   /* 항목 간의 간격 */
  }
  </style>