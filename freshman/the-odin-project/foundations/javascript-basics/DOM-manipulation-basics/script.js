const body = document.querySelector('body') 

const p = document.createElement('p');
p.textContent = 'Hey I\'m red';
p.style.color = 'red';
body.appendChild(p);

const h3 = document.createElement('h3');
h3.textContent = 'I\'m a blue h3!';
h3.style.color = 'blue';
body.appendChild(h3);

const div = document.createElement('div');
div.style.border = '5px solid';
div.style.borderColor = 'black';
div.style.backgroundColor = 'pink';

const h1 = document.createElement('h1');
h1.textContent = 'I\'m in a div';

const pChild = document.createElement('p');
pChild.textContent =  'ME TOO!';

div.appendChild(h1);
div.appendChild(pChild);
body.appendChild(div);