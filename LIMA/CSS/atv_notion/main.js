const botaoAnimar = document.getElementById("animar");
const caixa = document.querySelector(".caixa");

botaoAnimar.addEventListener("click", ()=> {
  caixa.style.animation = "";
  setTimeout(() => caixa.style.animation = "deslizar 1s linear", 5);
});