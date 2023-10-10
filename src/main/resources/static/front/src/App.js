import { useEffect, useState } from 'react';
import './App.css';
import Formulario from './Formulario';
import Tabela from './Tabela';

function App() {

  //objeito produto
  const product = {
      id : 0,
      name: ''
  }

  //useState
  const [btnCadastrar, setBtnCadastrar] = useState(true);

  const [products, setProdutos] = useState([]);

  //useEffect
  useEffect (() =>{
    fetch("http://localhost:8080/products")
    .then(retorno => retorno.json())
    .then(retorno_convertido => setProdutos(retorno_convertido));
  },[]
  )
 
  return (
    <>
      <Formulario botao={btnCadastrar}/>
      <Tabela vetor={products}/>
    </>
  );
}

export default App;
