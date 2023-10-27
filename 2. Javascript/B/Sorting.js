let array = prompt("Enter an array of numbers separated by comma: ");
array = array.split(",").map(Number);

array.sort((a, b) => {
    if (a < b) {
        return 1;
    }
    if (a > b) {
        return -1;
    }
    return 0;
});

console.log(array);