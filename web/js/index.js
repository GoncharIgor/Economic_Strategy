const doc = document;
doc.title = "Economic Strategy" + " | Home";

let goldAmount = 10;
let ironAmount = 10;
let stoneAmount = 10;

let goldMinesAmount = 1;
let ironMinesAmount = 1;
let stoneMinesAmount = 1;

let milkFarmsAmount = 0;
let meatFarmsAmount = 0;

let warriorsAmount = 0;
let heavyWarriorsAmount = 0;
let magesAmount = 0;
let workersAmount = 0;

function updateGold () {
    document.getElementById('gold-amount').value = goldAmount;
    goldAmount += goldMinesAmount;
};

function updateIron() {
    document.getElementById('iron-amount').value = ironAmount;
    ironAmount++;
}

function updateStone() {
    document.getElementById('stone-amount').value = stoneAmount;
    stoneAmount++;
}

function addGoldMine() {
    goldMinesAmount++;
    doc.getElementById('info-textfield').value = 'Gold mine was added';
    setTimeout(function(){
        doc.getElementById('info-textfield').value = '';
    }, 5000);
}

function updateAllResources() {
    updateGold();
    updateIron();
    updateStone();
}

function modify_qty(val) {
    let qty = document.getElementById('qty').value;
    let new_qty = parseInt(qty,10) + val;

    if (new_qty < 0) {
        new_qty = 0;
    }

    document.getElementById('qty').value = new_qty;
    return new_qty;
}

setInterval(updateAllResources, 1000); // updateAllResources - name of a function
