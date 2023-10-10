function Tabela({vetor}){
    return (
        <table className="table">
            <thead>
                <tr>
                    <th>#</th>
                    <th>NOME</th>
                    <th>SELECIONAR</th>
                </tr>
            </thead>
            <tbody>
                {
                    vetor.map((obj, indice) => (
                        <tr key={indice}>
                            <td>{indice+1}</td>
                            <td>{obj.name}</td>
                            <td><button className="btn btn-success">Selecionar</button></td>
                        </tr>
                    ))
                }
            </tbody>
        </table>
    )
}

export default Tabela;