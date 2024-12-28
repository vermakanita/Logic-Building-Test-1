// let a=[[a,b,c],
//        [c,d,f],
//        [d,f,g]];

//        let arr = a.flat();
//        let obj={};

//        for(let i=0;i<arr.legth;i++){
//         let e = arr[i];
//         if(!obj[e]){
//             boj[e]=1;
//         }
//         else{
//             boj[e]=obj[e]+1
//         }
//        }
//        console.log(boj);



let a = [['a', 'b', 'c'], ['c', 'd', 'f'], ['d', 'f', 'g']];

let arr = a.flat();
let obj = {};

for (let i = 0; i < arr.length; i++) {
    let e = arr[i];
    if (!obj[e]) {
        obj[e] = 1;
    } else {
        obj[e] = obj[e] + 1;
    }
}

console.log(obj);