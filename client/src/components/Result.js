import React from 'react'

const Result = () => {

    return (
        <div>
           {Result.defaultProps.name}
        </div>
    )
}

Result.defaultProps = {
    name: '이름없음'
  }

export default Result

