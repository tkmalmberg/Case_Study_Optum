var raceArray = [
  "Dwarf",
  "Elf",
  "Halfing",
  "Human",
  "Dragonborn",
  "Gnome",
  "Half-Elf",
  "Half-Orc",
  "Tiefling",
];

var classArray = [
  "Barbarian",
  "Bard",
  "Cleric",
  "Druid",
  "Fighter",
  "Monk",
  "Paladin",
  "Ranger",
  "Rogue",
  "Sorcerer",
  "Warlock",
  "Wizard",
];

var Character = function(name, race, cla) {
    this.name = name;
    this.race = race;
    this.cla = cla;
}

var button = document.getElementById('createButton');

for (let i = 0; i < raceArray.length; i++) {
  const select = document.getElementById("raceSelect");
  var newRace = document.createElement("option");
  newRace.textContent = raceArray[i];
  newRace.setAttribute("value", raceArray[i]);
  select.appendChild(newRace);
}

for (let i = 0; i < classArray.length; i++) {
    const select = document.getElementById("classSelect");
    var newClass = document.createElement("option");
    newClass.textContent = classArray[i];
    newClass.setAttribute("value", classArray[i]);
    if (i%2 === 0){
        newClass.setAttribute("style", "color: red")
    }
    select.appendChild(newClass);
  }

  const displayChar = () => {
    
    const formData = document.getElementById('charForm').elements;
    for (var i = 0; i < formData.length; i++) {
        var item = formData.item(i);
        let table = document.getElementById('charTable');
        var newHead = document.createElement('td');
        var newBody = document.createElement('td');
        newHead.textContent = item.name;
        newBody.textContent = item.value;
        table.firstChild.firstChild.appendChild(newHead);
        table.lastChild.firstChild.appendChild(newBody);
        console.log('here');
    }
  }

  button.addEventListener('click', displayChar);