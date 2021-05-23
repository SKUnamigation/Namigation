import React from 'react'

const test = () => {

    const confirm = () => {
        window.confirm("안녕하세요")
    }
    

    return (
        <div>
            <button onClick={confirm}>확인창을 보여준다.</button>
            
        </div>
    )
}

export default test
