var monsterArray = ["Goblin", "Bugbear", "Dragon", "Acolyte"];
var characterArray = ["Kaspos", "Kraxnar", "Taako", "Jim"];
var button = document.getElementById("show");

const show = () => {
  for (let i = 0; i < monsterArray.length; i++) {
    const ul = document.getElementById("monsterList");
    var newMon = document.createElement("li");
    newMon.className = "list-group-item";
    newMon.textContent = monsterArray[i];

    console.log(newMon);
    ul.appendChild(newMon);
  }

  for (let i = 0; i < characterArray.length; i++) {
    const ul = document.getElementById("characterList");
    var newChar = document.createElement("li");
    newChar.className = "list-group-item";
    newChar.textContent = characterArray[i];

    console.log(newChar);
    ul.appendChild(newChar);
  }
};

button.addEventListener("click", show);