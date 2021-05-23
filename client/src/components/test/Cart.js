import React from 'react'
import { post } from 'axios';

const Cart = () => {

    const addpredict = () => {
        const url = '/hello/insert';
        const formData = new FormData();
        formData.append('userNum', '1234');
        formData.append('high', '1234');
        formData.append('middle', '1234');
        formData.append('low', '1234');
        formData.append('good', '1234');
        const config = {
            headers: {
                'content-type': 'multipart/form-data'
            }
        }
        return post(url, formData, config);
    }


    return (
        <div>
            <button onClick={addpredict}>버어튼</button>
        </div>
    )
}




export default Cart
